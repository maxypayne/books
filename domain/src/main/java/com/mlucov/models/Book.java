package com.mlucov.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "isbn")
    String ISBN;
}
