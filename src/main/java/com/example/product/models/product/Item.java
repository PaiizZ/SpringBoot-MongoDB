package com.example.product.models.product;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Item {
    private String option1;
    private String option2;
    private String option3;
    private Integer price;
}
