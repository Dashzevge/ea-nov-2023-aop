package com.example.lab2.dtos;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private int id;
    private String name;

    private List<ProductDto> products;
}
