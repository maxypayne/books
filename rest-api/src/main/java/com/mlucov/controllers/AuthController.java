package com.mlucov.controllers;

import com.mlucov.business.auth.AuthUseCaseApi;
import com.mlucov.models.request.LoginRequest;
import com.mlucov.models.response.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthUseCaseApi authUseCaseApi;

    public AuthController(AuthUseCaseApi authUseCaseApi) {
        this.authUseCaseApi = authUseCaseApi;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return new LoginResponse(this.authUseCaseApi.login(request.email(), request.password()));
    }
}