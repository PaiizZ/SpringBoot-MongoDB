package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping("/v1/products")
    public List<Product> getProducts() {
        return repository.findAll();
    }


    @PostMapping("/v1/product")
    public Product createProduct(@Valid @RequestBody Product product) {
        product.set_id(ObjectId.get());
        repository.save(product);
        return product;
    }
}
