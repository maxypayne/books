package com.mlucov.business.auth;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenServiceGateway {
    String generateToken(UserDetails userDetails);
}
