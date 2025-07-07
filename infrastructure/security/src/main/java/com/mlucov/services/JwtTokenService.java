package com.mlucov.services;

import com.mlucov.JwtUtil;
import com.mlucov.business.auth.TokenServiceGateway;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtTokenService implements TokenServiceGateway {
    private final JwtUtil jwtUtil;

    public JwtTokenService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return jwtUtil.generateToken(userDetails);
    }
}
