package com.data.controller;

import com.data.dto.ProductCreateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProductCreateDTO productCreateDTO) {
        if (productCreateDTO.getProductName().isEmpty()) {
            return ResponseEntity.badRequest().body("Product3 name is required!");
        }
        return ResponseEntity.ok(productCreateDTO);
    }
}
