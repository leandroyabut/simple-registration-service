package com.leandroyabut.registrationservice.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponse {
    private String username;
    private String email;
    private LocalDate dateOfBirth;
    private String firstName;
    private String middleName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
}
