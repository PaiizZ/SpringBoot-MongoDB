package com.example.product.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)

public class Product {
    @Id
    private ObjectId _id;
    @NotNull private String code;
    @NotNull private String name;
    private String description;
    private String[] product_tags;
    private String[] product_photos;
    @NotNull private List<Item> items;
}