package com.mlucov.models.request;

import org.springframework.web.multipart.MultipartFile;

public record SaveProductRequest(
    String name,
    String description,
    Double price,
    String sku,
    MultipartFile file,
    String brand,
    Short categoryId
){
}
