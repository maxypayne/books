package com.mlucov.models.response;

public record ProductCardResponse(
    Long id,
    String imageUrl,
    String title,
    String description
) {
}
