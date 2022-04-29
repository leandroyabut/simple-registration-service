package com.leandroyabut.registrationservice.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class UserRegistration {
    @NotBlank(message = "Username is required.")
    private String username;

    @NotBlank(message = "Password is required.")
    private String password;

    @NotNull(message = "Date of birth is required.")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Email is required.")
    @Email(message = "Email is not a valid email.")
    private String email;

    @NotBlank(message = "First name is required.")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last name is required.")
    private String lastName;

    @NotBlank(message = "Address line 1 is required.")
    private String addressLine1;

    private String addressLine2;

    @NotBlank(message = "City is required.")
    private String city;

    @NotBlank(message = "State is required.")
    private String state;

    @NotBlank(message = "Zipcode is required.")
    private String zipcode;
}
