package com.data.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

// java class + @RestController = Controller
@RestController
public class ProductController {
    // localhost:8080/getData
    @GetMapping("getData")
    public String getData() {
        return "Name: Ngoc";
    }

    @GetMapping("getData2")
    public int getData2() {
        return 18;
    }

    @GetMapping("getData3")
    public ResponseEntity<?> getData3() {
        return new ResponseEntity<>("Name: Chien", HttpStatus.OK); // 200
    }

    @GetMapping("getData4")
    public ResponseEntity<?> getData4() {
        return new ResponseEntity<>(25, HttpStatus.CREATED); // 201
    }

    @GetMapping("getData5")
    public ResponseEntity<?> getData5() {
        return new ResponseEntity<>(new Date(), HttpStatus.BAD_REQUEST); // 400
    }

    @GetMapping("getData6")
    public ResponseEntity<?> getData6() {
        return new ResponseEntity<>(true, HttpStatus.CONFLICT); // 409
    }

    @PostMapping("createData7")
    public ResponseEntity<?> createData7() {
        return new ResponseEntity<>("Create account", HttpStatus.OK);
    }
}
