package com.example.product.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Accessors(chain = true)

public class Product {
    @Id
    private ObjectId _id;
    private String name;
    private String price;
}