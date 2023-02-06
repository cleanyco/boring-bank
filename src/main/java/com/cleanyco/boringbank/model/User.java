package com.cleanyco.boringbank.model;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private long userId;
    //TODO add currency list

    @NotBlank(message = "Name cannot be empty!")
    @Size(min=3, max = 16, message = "Name should be between 2 and 16 characters!")
    private final String firstname;
    @NotBlank(message = "Lastname cannot be empty!")
    @Size(min=3, max = 16, message = "Lastname should be between 2 and 32 characters!")
    private final String lastname;

    @NotBlank(message = "Date of Birth cannot be empty!")
    private final LocalDate dateOfBirth;

    //TODO implement change email function
    @Email(message = "E-mail is incorrect!")
    private String email;

    @NotBlank(message = "Phone number cannot be empty!")
    @Size(min = 12, max = 12)
    //FIXME incorrect
    @Pattern(regexp = "\\+7[0-9]{10}", message = "Phone number is incorrect!")
    private String phoneNumber;

    public User(long userId, String firstname, String lastname, LocalDate dateOfBirth, String email, String phoneNumber) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstname, String lastname, LocalDate dateOfBirth, String email, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
