package com.example.zpi.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String name;

    @Column()
    private String lastName;

    @Column()
    private String password;

    @Column()
    private Date dateOfBirth;

    @Column
    private String adress;

    @Column
    private String Email;


    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
