package com.mlucov.repository.category;

import com.mlucov.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<Category, Short> {
}
