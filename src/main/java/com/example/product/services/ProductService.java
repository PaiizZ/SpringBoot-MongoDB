package com.example.product.services;

import com.example.product.controllers.GlobalExceptionHandler;
import com.example.product.exception.NotFoundException;
import com.example.product.models.product.Product;
import com.example.product.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {
        return repository.findAll();
    }


    public Product getProduct(ObjectId id) {
        log.info("{}", repository.findBy_id(id));
        Product product = repository.findBy_id(id);
        if(product == null) throw new NotFoundException("404", "ไม่เจอนะจ๊ะ");
      return repository.findBy_id(id);
    }

    public Product getProductByName(String name) { return repository.findByName(name); }

    public Product createProduct(Product product) {
        product.set_id(ObjectId.get());
        repository.save(product);
        return product;
    }

    public void deleteProduct(ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }

    public Product updateProduct(ObjectId id, Product product) {
        product.set_id(id);
        repository.save(product);
        return product;
    }
}
