package com.example.product.models.product;

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
    @NotNull(
            message = "Code is required"
    ) private String code;
    @NotNull (
            message = "Name is required"
    ) private String name;
    private String description;
    private String[] product_tags;
    private String[] product_photos;
    private List<Item> items;
}