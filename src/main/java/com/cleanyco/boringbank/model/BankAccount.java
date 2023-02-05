package com.cleanyco.boringbank.model;

import lombok.Data;

@Data
public class BankAccount {

    private enum Currency {
        USD, //dollar
        EUR, //euro
        CHF, //swiss frank
        GPB, //british pound
        MXN, //mexican peso
        PLN, //polish zloty
        TRY, //turkish lira
        JPY, //japanese yen
        CHN, //chinese yuan
        RUB  //russian ruble
    }

    private long accountId;
    private final Currency currency;

    private int balance;

    public BankAccount(long accountId, Currency currency, int balance) {
        this.accountId = accountId;
        this.currency = currency;
        this.balance = balance;
    }

    public BankAccount(Currency currency, int balance) {
        this.currency = currency;
        this.balance = balance;
    }
}
