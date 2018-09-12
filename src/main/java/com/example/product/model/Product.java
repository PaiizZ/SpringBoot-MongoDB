package com.example.product.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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

    // Constructors
    public Product() {}

    public Product(ObjectId _id, String name, String price) {
        this._id = _id;
        this.name = name;
        this.price = price;
    }
}