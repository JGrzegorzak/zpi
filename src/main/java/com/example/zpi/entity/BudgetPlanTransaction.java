package com.example.zpi.entity;

import jakarta.persistence.*;

@Entity
public class BudgetPlanTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private BudgetPlan budgetPlan;

    @ManyToOne(cascade = CascadeType.ALL)
    private Transactions transactions;

    @Column
    private double amount;

}
