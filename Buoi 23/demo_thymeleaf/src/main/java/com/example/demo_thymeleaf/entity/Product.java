package com.example.demo_thymeleaf.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Entity
@Table(name = "products")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "product_name", unique = true, nullable = false,
    columnDefinition = "VARCHAR(100)")
    String productName;

    @Column(name = "price", unique = false, nullable = false)
    int price;

    @Column(name = "stock", unique = false, nullable = false,
    columnDefinition = "VARCHAR(70)")
    int stock;

    @Column(name = "image", unique = true, nullable = false,
            columnDefinition = "VARCHAR(100)")
    String image;

}
