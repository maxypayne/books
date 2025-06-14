package com.mlucov.models.request;

public record LoginRequest(
    String email,
    String password
) {
}
