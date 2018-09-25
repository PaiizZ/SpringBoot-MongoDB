package com.example.product.models.product;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Accessors(chain = true)
public class Item {
    @NotNull private String option1;
    private String option2;
    private String option3;
    @NotNull private Integer price;
}
