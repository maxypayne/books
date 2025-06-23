package com.mlucov.business.category;

import com.mlucov.entities.Category;

import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(short id);
    Category save(Category category);
}
