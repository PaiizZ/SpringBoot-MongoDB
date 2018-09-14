package com.example.product.controllers;

import com.example.product.models.Product;
import com.example.product.services.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") ObjectId id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") ObjectId id) { productService.deleteProduct(id); }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") ObjectId id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

}
