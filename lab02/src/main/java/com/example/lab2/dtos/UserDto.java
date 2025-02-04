package com.example.lab2.dtos;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private List<ReviewDto> reviews;

    private  AddressDto address;

}
