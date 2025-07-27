package com.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table(name = "persons")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username", unique = true, nullable = false,
    columnDefinition = "VARCHAR(50)")
    String username;

    @Column(name = "password", unique = false, nullable = false,
    columnDefinition = "VARCHAR(50)")
    String password;

    @Column(name = "full_name", unique = false, nullable = false,
    columnDefinition = "VARCHAR(100)")
    String fullName;

    @OneToOne(mappedBy = "person")
    Identity identity;
}
