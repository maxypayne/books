package com.mlucov.repository.user;

import com.mlucov.business.user.UserGateway;
import com.mlucov.models.User;

import java.util.Optional;

public class UserGatewayRepository implements UserGateway {
    private static UserRepository repository;
    @Override

    public Optional<User> getUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

}
