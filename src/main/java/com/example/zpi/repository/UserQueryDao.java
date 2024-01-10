package com.example.zpi.repository;


import com.example.zpi.dto.LoginDto;
import com.example.zpi.entity.QUser;
import com.example.zpi.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

import java.util.Optional;

@Repository
public class UserQueryDao {

    private static final QUser QUSER = QUser.user;

    @PersistenceContext
    private EntityManager entityManager;


    public Optional<User> login(LoginDto dto) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return Optional.ofNullable(queryFactory.select(QUSER)
                .from(QUSER)
                .where(QUSER.email.eq(dto.getEmail()),
                        QUSER.password.eq(dto.getPassword()))
                .fetchFirst());
    }

}
