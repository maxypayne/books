package com.mlucov.business.product;

import com.mlucov.models.Product;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(long id);
    Product save(Product product);
}
