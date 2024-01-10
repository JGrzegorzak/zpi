package com.example.zpi.mappers;

import com.example.zpi.dto.AccountDto;
import com.example.zpi.dto.CurrencyDto;
import com.example.zpi.dto.UserDto;
import com.example.zpi.entity.Accounts;
import com.example.zpi.entity.Currency;
import com.example.zpi.entity.User;

public final class DtoTransformer {
    private DtoTransformer() {
    }

    public static UserDto toUserDto(User user) {
        final var userDto = new UserDto(user.getId());
        userDto.setAdress(user.getAdress());
        userDto.setEmail(user.getEmail());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setLastName(user.getLastName());
        userDto.setName(user.getName());
        return userDto;
    }

    public static CurrencyDto toCurrencyDto(Currency currency) {
        return new CurrencyDto(currency.getShort_Name(), currency.getIsoCode());
    }

    public static AccountDto toAccountDto(Accounts accounts) {
        final var accountDto = new AccountDto(accounts.getId(), toUserDto(accounts.getUser()));
        accountDto.setAccountType(accountDto.getAccountType());
        accountDto.setAccountNumber(accountDto.getAccountNumber());
        accountDto.setCurrencyDto(toCurrencyDto(accounts.getCurrency()));
        accountDto.setBalance(accounts.getBalance());
        accountDto.setName(accountDto.getName());
        return accountDto;
    }
}
