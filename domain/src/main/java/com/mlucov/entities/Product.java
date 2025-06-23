package com.mlucov.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

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

    @Column(name = "is_active")
    boolean active;

    @JoinColumn(name = "category_id")
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rating> ratings = new ArrayList<>();

    // Getter utile
    public double getAverageRating() {
        return ratings.isEmpty() ? 0.0 :
            ratings.stream().mapToInt(Rating::getScore).average().orElse(0.0);
    }

}
