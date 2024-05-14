package ru.aston.WebApplication.entity;

import jakarta.persistence.*;

public class User {
    
    @Id
    @Column(name="id")
    @GeneratedValue ( strategy = GeneratedValue.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private char[] password;

    @OneToMany
    @JoinColumn()
    private List<Orders> orders;

}
