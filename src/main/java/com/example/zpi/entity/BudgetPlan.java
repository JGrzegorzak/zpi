package com.example.zpi.entity;

import jakarta.persistence.*;

@Entity
public class BudgetPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private double monthLimit;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

}
