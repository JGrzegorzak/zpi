package com.example.zpi.entity;

import jakarta.persistence.*;

import java.util.Date;

public class TransactionTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long templateId;

    @Column
    private String templateName;

    @Column
    private String sourceAccountNumber;

    @Column
    private String targetAccountNumber;

    @Column
    private String transactionDetails;

    @Column
    private String transactionTitle;

    @Column
    private double amount;

    @Column
    private Date executionDate;

    @Column
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne(cascade = CascadeType.ALL)
    private Currency currency;

    @Column
    private String comments;

}
