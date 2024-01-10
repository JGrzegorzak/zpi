package com.example.zpi.dto;

import com.example.zpi.entity.AccountType;

public class AccountDto {

    private final Long id;
    private final UserDto user;
    private String name;
    private Long balance;
    private AccountType accountType;
    private String accountNumber;
    private CurrencyDto currencyDto;


    public AccountDto(Long id, UserDto user) {
        this.id = id;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public UserDto getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CurrencyDto getCurrencyDto() {
        return currencyDto;
    }

    public void setCurrencyDto(CurrencyDto currencyDto) {
        this.currencyDto = currencyDto;
    }
}
