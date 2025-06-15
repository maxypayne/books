package com.mlucov.business.role;

import com.mlucov.models.Role;

import java.util.Optional;

public interface RoleRepository {
    Optional<Role> findByName(String roleName);
}
