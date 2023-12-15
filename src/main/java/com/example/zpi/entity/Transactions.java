package com.example.zpi.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Accounts accounts;

    @ManyToOne(cascade = CascadeType.ALL)
    private TransactionType transactionType;

    @Column
    private Date transactionDate;

    @Column
    private double amount;

    @ManyToOne(cascade = CascadeType.ALL)
    private Currency currency;

}
