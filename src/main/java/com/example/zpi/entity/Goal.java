package com.example.zpi.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Accounts accounts;

    @Column
    private String goalName;

    @Column
    private String goalDescription;

    @Column
    private double goalAmount;

    @Column
    private Date goalDate;

    @Column
    private double progress;

    @Column
    private String goalStatus;

}
