package com.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data // getter, setter, toString
@Entity
@Table(name = "departments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "department_name", unique = true, nullable = false,
    columnDefinition = "VARCHAR(100) CHECK(LENGTH(department_name) <= 100)")
    String departmentName;

    @Column(name = "address", unique = false, nullable = false,
    columnDefinition = "VARCHAR(100) CHECK(LENGTH(address) <= 100)")
    String address;

    @OneToMany(mappedBy = "department")
    List<Employee> employees;

}
