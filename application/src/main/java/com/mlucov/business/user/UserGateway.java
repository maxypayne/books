package com.mlucov.business.user;

import com.mlucov.models.User;

import java.util.Optional;

public interface UserGateway {
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserById(Long id);
    Optional<User> findByUsername(String username);
}
