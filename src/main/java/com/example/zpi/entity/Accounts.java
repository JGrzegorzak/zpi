package com.example.zpi.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @Column
    private String name;

    @Column
    private Long balance;

    @ManyToOne(cascade = CascadeType.ALL)
    private AccountType accountType;

    @Column
    private Date openDate;

    @Column
    private String accountNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    private Currency currency;

}