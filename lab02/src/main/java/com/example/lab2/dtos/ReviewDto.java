package com.example.lab2.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {
    private int id;
    private String comment;

    private UserDto user;
    private ProductDto product;
}
