package com.cleanyco.boringbank.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private long userId;
    //TODO add currency list

    private final String firstname;
    private final String surname;
    private final LocalDate dateOfBirth;

    //TODO implement change email function
    private String email;

    public User(long userId, String firstname, String surname, LocalDate dateOfBirth, String email) {
        this.userId = userId;
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public User(String firstname, String surname, LocalDate dateOfBirth, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
}
