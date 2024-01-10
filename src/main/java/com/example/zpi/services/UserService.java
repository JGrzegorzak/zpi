package com.example.zpi.services;

import com.example.zpi.dto.AccountDto;
import com.example.zpi.dto.LoginDto;
import com.example.zpi.dto.UserDto;
import com.example.zpi.entity.Accounts;
import com.example.zpi.entity.User;
import com.example.zpi.mappers.DtoTransformer;
import com.example.zpi.repository.AccountsQueryDao;
import com.example.zpi.repository.UserQueryDao;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserQueryDao userQueryDao;
    private final AccountsQueryDao accountsQueryDao;

    @Autowired
    public UserService(UserQueryDao userQueryDao, AccountsQueryDao accountsQueryDao) {
        this.userQueryDao = userQueryDao;
        this.accountsQueryDao = accountsQueryDao;
    }

    public AccountDto login(LoginDto loginDto) {
        Optional<User> login = userQueryDao.login(loginDto);
        if (login.isPresent()) {
            Optional<Accounts> account = accountsQueryDao.getAccountByUser(login.get());
            if (account.isPresent()) {
                return DtoTransformer.toAccountDto(account.get());
            }
            throw new EntityNotFoundException();
        }
        throw new EntityNotFoundException();
    }
}
