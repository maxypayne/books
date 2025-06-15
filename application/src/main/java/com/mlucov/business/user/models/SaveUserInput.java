package com.mlucov.business.user.models;

import java.util.Set;

public record SaveUserInput(
    String username,
    String email,
    String password,
    Set<String>roles
) {
}
