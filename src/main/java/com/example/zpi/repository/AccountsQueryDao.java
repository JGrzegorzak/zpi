package com.example.zpi.repository;

import com.example.zpi.dto.LoginDto;
import com.example.zpi.entity.Accounts;
import com.example.zpi.entity.QAccounts;
import com.example.zpi.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AccountsQueryDao {

    private static final QAccounts QACCOUNTS = QAccounts.accounts;

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Accounts> getAccountByUser(User user) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return Optional.ofNullable(queryFactory.select(QACCOUNTS)
                .from(QACCOUNTS)
                .where(QACCOUNTS.user.id.eq(user.getId()))
                .fetchFirst());
    }
}
