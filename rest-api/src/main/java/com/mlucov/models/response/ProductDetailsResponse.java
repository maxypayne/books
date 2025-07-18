package com.mlucov.models.response;

public record ProductDetailsResponse(
    Long id,
    String title,
    String description,
    Double price,
    Integer stockQuantity,
    String imageUrl,
    String brand,
    boolean isActive,
    String category,
    Double rating
) {
}
