package com.data.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("search1")
    public ResponseEntity<?> search1(
            @RequestParam(required = false, defaultValue = "") String fullName,
            @RequestParam(required = false, defaultValue = "18") Integer age
    ) {
        System.out.println("fullName: " + fullName);
        System.out.println("age: " + age);
        return new ResponseEntity<>("full name: " + fullName + ". age: " + age , HttpStatus.OK);
    }

    @GetMapping("search2/{name}/{email}")
    public ResponseEntity<?> search2(@PathVariable String name,
                                     @PathVariable String email) {
        System.out.println("name: " + name);
        System.out.println("email: " + email);

        return new ResponseEntity<>("name: " + name + ". email: " + email, HttpStatus.OK);
    }

    // path variable: dùng làm url cho danh mục: /san-pham/dien-thoai (dien-thoai la du lieu dong)
    //                                           /san-pham/laptop (laptop la du lieu dong)
    // request param: dùng để tìm kiếm: /tai-khoan?ho=nguyen&diaChi=HN&soThich=hat
    // request param: dùng để tìm kiếm: /tai-khoan?ho=nguyen
}
