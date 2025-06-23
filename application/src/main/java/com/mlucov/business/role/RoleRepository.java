package com.mlucov.business.role;

import com.mlucov.entities.Role;

import java.util.Optional;

public interface RoleRepository {
    Optional<Role> findByName(String roleName);
}
