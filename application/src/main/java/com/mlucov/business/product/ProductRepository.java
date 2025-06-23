package com.mlucov.business.product;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.business.product.models.GetProductsInput;
import com.mlucov.entities.Product;
import com.mlucov.models.Paginated;

import java.awt.print.Pageable;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(long id);
    Product save(Product product);
    Paginated<Product> findAll(GetProductsInput input);
}
