package com.mlucov.services;

import com.mlucov.business.auth.AuthGateway;
import exception.InvalidCredentialsException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SpringAuthService implements AuthGateway {
    private final AuthenticationManager authManager;

    public SpringAuthService(AuthenticationManager authManager) {
        this.authManager = authManager;
    }

    @Override
    public UserDetails authenticate(String email, String password) {
        try {
            Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(email, password)
            );
            return (UserDetails) authentication.getPrincipal();
        } catch (BadCredentialsException ex) {
            throw new InvalidCredentialsException("Identifiants incorrects");
        }
    }
}
