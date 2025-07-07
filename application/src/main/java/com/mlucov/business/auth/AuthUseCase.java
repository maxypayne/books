package com.mlucov.business.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AuthUseCase implements AuthUseCaseApi {
    private final TokenServiceGateway tokenServiceGateway;
    private final AuthGateway authGateway;

    public AuthUseCase(TokenServiceGateway tokenServiceGateway, AuthGateway authGateway) {
        this.tokenServiceGateway = tokenServiceGateway;
        this.authGateway = authGateway;
    }

    @Override
    public String login(String email, String password) {
        UserDetails userDetails = authGateway.authenticate(email, password);
        return tokenServiceGateway.generateToken(userDetails);
    }
}
