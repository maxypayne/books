package com.mlucov.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
    private int id;
    private String customer;
    private List<Product> products;

    public Order(int id, String customer, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
    }
}
