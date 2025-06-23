package com.mlucov.business.product.query;

public record ProductCardOutput(
    Long id,
    String imageUrl,
    String title,
    String description
) {
}
