package com.mlucov.business.user.save;

import com.mlucov.business.role.RoleRepository;
import com.mlucov.business.user.UserRepository;
import com.mlucov.business.user.models.SaveUserInput;
import com.mlucov.models.Role;
import com.mlucov.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@Transactional
public class SaveSaveUserUseCase implements SaveUserUseCaseApi {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public SaveSaveUserUseCase(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public Long createUser(SaveUserInput input) {
//        if(userRepository.existsByEmail(input.email())) {
//            throw new IllegalArgumentException("Email déjà utilisé");
//        }
//        if(userRepository.existsByUsername(input.username())) {
//            throw new IllegalArgumentException("Username déjà utilisé");
//        }

        User user = new User();
        user.setUsername(input.username());
        user.setEmail(input.email());
        user.setPassword(passwordEncoder.encode(input.password()));
        user.setEnabled(true);
        user.setCreatedAt(LocalDateTime.now());

        Set<Role> roles = input.roles().stream()
            .map(roleName -> roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role non trouvé: " + roleName)))
            .collect(Collectors.toSet());

        user.setRoles(roles);

        return userRepository.save(user).getId();
    }
}
