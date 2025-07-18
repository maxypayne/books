package com.mlucov.business.product.models;

import org.springframework.web.multipart.MultipartFile;

public record SaveProductInput(
    String name,
    String description,
    Double price,
    String sku,
    MultipartFile file,
    String brand,
    Short categoryId
) {
}
