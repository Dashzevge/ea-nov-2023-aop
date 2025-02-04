package com.example.lab2.dtos;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ProductDto {
    private int id;
    private String name;
    private int price;
    private int rating;

    private CategoryDto category;
    private List<ReviewDto> reviews;

}
