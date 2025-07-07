package com.mlucov.business.auth;

import org.springframework.security.core.userdetails.UserDetails;

public interface AuthGateway {
    UserDetails authenticate(String email, String password);
}
