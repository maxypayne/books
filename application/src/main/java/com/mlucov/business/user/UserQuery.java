package com.mlucov.business.user;

import com.mlucov.business.user.models.RoleOutput;
import com.mlucov.business.user.models.UserDetailsOutput;
import com.mlucov.models.User;
import exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserQuery implements UserQueryApi {
    private UserGateway userGateway;

    @Override
    public UserDetailsOutput getUserDetailsByEmail(String email) {
        User user = userGateway.getUserByEmail(email)
            .orElseThrow(() -> new UserNotFoundException("User not found"));

        return new UserDetailsOutput(
            user.getId(),
            user.getUsername(),
            user.getPassword(),
            user.isEnabled(),
            user.getRoles().stream()
                .map(role -> new RoleOutput(role.getId(), role.getName()))
                .toList()
        );
    }

    @Override
    public UserDetailsOutput getUserDetailsById(Long id) {
        User user = userGateway.getUserById(id)
            .orElseThrow(() -> new UserNotFoundException("User not found"));
        return new UserDetailsOutput(
            user.getId(),
            user.getUsername(),
            user.getPassword(),
            user.isEnabled(),
            user.getRoles().stream()
                .map(role -> new RoleOutput(role.getId(), role.getName()))
                .toList()
        );
    }
}
