package com.example.lab2.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private int id;
    private String street;
    private int zip;
    private String city;

    private UserDto user;
}
