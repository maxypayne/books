package com.mlucov.models.request;

import java.util.Set;

public class UserCreationRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> roles;  // noms des rôles, ex: ["ROLE_USER"]

    // getters et setters
}
