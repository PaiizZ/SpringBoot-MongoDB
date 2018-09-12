package com.example.product.services;

import com.example.product.models.Product;
import com.example.product.repositories.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    public Product getProduct(ObjectId id) {
        return repository.findBy_id(id);
    }

    public Product createProduct(Product product) {
        product.set_id(ObjectId.get());
        repository.save(product);
        return product;
    }
}
