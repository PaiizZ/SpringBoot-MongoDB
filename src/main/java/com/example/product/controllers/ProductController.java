package com.example.product.controllers;

import com.example.product.models.Product;
import com.example.product.services.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/product")
    public Product getProductByName(@RequestParam("name") String name) {
        return productService.getProductByName(name);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") ObjectId id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") ObjectId id) { productService.deleteProduct(id); }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") ObjectId id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

}
