package com.data.controller;

import com.data.entity.Department;
import com.data.entity.Employee;
import com.data.repository.DepartmentRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("departments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepo;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Department> departments = departmentRepo.findAll();
        departments.forEach(department -> {
            System.out.println("=======");

            System.out.println(department.getId());
            System.out.println(department.getDepartmentName());

            List<Employee> employees = department.getEmployees();
            employees.forEach(employee -> {
                System.out.println(employee.getId());
                System.out.println(employee.getUsername());
            });
        });

        // trả về size, trả về departments lỗi
        return ResponseEntity.ok(departments.size());
    }

}
