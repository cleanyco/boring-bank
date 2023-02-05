package com.cleanyco.boringbank.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private long userId;
    //TODO add currency list

    private final String firstname;
    private final String lastname;
    private final LocalDate dateOfBirth;

    //TODO implement change email function
    private String email;
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
