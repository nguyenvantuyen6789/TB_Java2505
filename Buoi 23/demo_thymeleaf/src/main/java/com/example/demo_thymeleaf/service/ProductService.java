package com.example.demo_thymeleaf.service;

import com.example.demo_thymeleaf.entity.Product;
import com.example.demo_thymeleaf.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductService {
    ProductRepository productRepo;

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepo.findById(id);
    }

    public boolean save(Product product) {
        productRepo.save(product);
        return true;
    }

    public boolean update(Product product) {
        productRepo.save(product);
        return true;
    }

    public boolean delete(Product product) {
        productRepo.delete(product);
        return true;
    }
}
