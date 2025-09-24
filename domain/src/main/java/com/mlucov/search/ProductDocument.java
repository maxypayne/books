package com.mlucov.search;

import jakarta.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")
public class ProductDocument {
    @Id
    private String id;

    private String name;
    private String description;
    private Double price;

    // getters, setters, etc.
}