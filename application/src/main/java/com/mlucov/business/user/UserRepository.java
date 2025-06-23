package com.mlucov.business.user;

import com.mlucov.entities.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserById(Long id);
    Optional<User> findByUsername(String username);
    User save(User user);
    boolean existsByEmail(String email);
}
