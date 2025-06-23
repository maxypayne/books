package com.mlucov.repository.category;

import com.mlucov.business.category.CategoryRepository;
import com.mlucov.business.product.ProductRepository;
import com.mlucov.models.Category;
import com.mlucov.models.Product;
import com.mlucov.repository.product.ProductJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private final CategoryJpaRepository repository;

    public CategoryRepositoryImpl(CategoryJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Category> findById(short id) {
        return repository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return this.repository.save(category);
    }
}
