package com.mlucov.repository.product;

import com.mlucov.business.product.ProductRepository;
import com.mlucov.models.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private ProductJpaRepository repository;
    @Override
    public Optional<Product> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return this.repository.save(product);
    }
}
