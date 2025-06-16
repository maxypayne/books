package com.mlucov.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Short id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    // This is the inverse side of the relationship.
    // 'mappedBy' indicates that the 'category' field in the Product entity is the owner.
    // CascadeType.ALL: Operations (persist, merge, remove, refresh) on Category will cascade to associated Products.
    // orphanRemoval = true: If a Product is removed from this 'products' set, it will be deleted from the database.
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>(); // Initialize to avoid NullPointerException
}
