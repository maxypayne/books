package com.mlucov.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    Double price;
    @Column(name = "stock_quantity")
    Integer stockQuantity;
    @Column(name = "sku")
    String sku;
    @Column(name = "image_url")
    String imageUrl;
    @Column(name = "brand")
    String brand;
    @Column(name = "rating")
    Double rating;

    @Column(name = "is_active")
    boolean active;

    @Column(name = "category_id")
    Integer categoryId;

    @JoinColumn(name = "category_id")
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;

}
