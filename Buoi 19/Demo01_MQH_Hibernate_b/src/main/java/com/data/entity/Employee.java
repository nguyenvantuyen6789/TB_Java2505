package com.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Entity
@Table(name = "employees")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username", unique = true, nullable = false,
    columnDefinition = "VARCHAR(50) CHECK(LENGTH(username) >= 3 AND LENGTH(username) <= 50)")
    String username;

    @Column(name = "password", unique = false, nullable = false,
    columnDefinition = "VARCHAR(20) CHECK(LENGTH(password) >= 6 AND LENGTH(password) <= 20)")
    String password;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    Date updatedDate;

    @Column(name = "birthday")
    @Temporal(TemporalType.TIME)
    Date birthday;

    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;
}
