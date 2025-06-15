package com.mlucov.models.request;

import java.util.Set;

public record SaveUserRequest(
     String username,
     String email,
     String password,
     Set<String> roles
){
}
