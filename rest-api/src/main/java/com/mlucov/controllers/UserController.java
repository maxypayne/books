package com.mlucov.controllers;

import com.mlucov.business.user.models.SaveUserInput;
import com.mlucov.business.user.save.SaveUserUseCaseApi;
import com.mlucov.models.request.SaveUserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserController {
    private final SaveUserUseCaseApi saveUserUseCaseApi;

    public UserController(SaveUserUseCaseApi saveUserUseCaseApi) {
        this.saveUserUseCaseApi = saveUserUseCaseApi;
    }

    @PostMapping("/create")
    public Long createUser(@RequestBody SaveUserRequest request) {
        return this.saveUserUseCaseApi.createUser(new SaveUserInput(
            request.username(),
            request.email(),
            request.password(),
            request.roles()
        ));
    }
}
