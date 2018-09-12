package com.example.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/v1/products")
    public ResponseEntity<String> getProduct() {
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
