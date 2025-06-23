package com.mlucov.repository.product;

import com.mlucov.business.product.ProductRepository;
import com.mlucov.business.product.models.GetProductsInput;
import com.mlucov.entities.Product;
import com.mlucov.models.Paginated;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductJpaRepository repository;

    public ProductRepositoryImpl(ProductJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Product> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return this.repository.save(product);
    }

    @Override
    public Paginated<Product> findAll(GetProductsInput input) {
        Pageable pageable = PageRequest.of(input.page(), input.size());
        Page<Product> products = repository.findAll(pageable);
        return new Paginated<>(products.getTotalElements(), products.getContent());
    }
}
