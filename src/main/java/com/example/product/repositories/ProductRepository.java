package com.example.product.repositories;

import com.example.product.models.product.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
    Product findBy_id(ObjectId _id);
}
