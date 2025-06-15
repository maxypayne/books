package com.mlucov.repository.role;

import com.mlucov.business.role.RoleRepository;
import com.mlucov.models.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    private final RoleJpaRepository roleJpaRepository;

    public RoleRepositoryImpl(RoleJpaRepository roleJpaRepository) {
        this.roleJpaRepository = roleJpaRepository;
    }
    @Override
    public Optional<Role> findByName(String name) {
        return roleJpaRepository.findByName(name);
    }
}
