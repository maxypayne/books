package com.mlucov.business.product.query;

public record ProductDetailsOutput(
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