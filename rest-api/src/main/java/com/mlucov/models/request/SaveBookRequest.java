package com.mlucov.models.request;

public record SaveBookRequest(
    String name,
    String isbn
) {
}
