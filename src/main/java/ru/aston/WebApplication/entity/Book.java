package ru.aston.WebApplication.dto;

import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="price")
    private double price;

    @Column(name="author_id")


    @ManyToOne

    private List<Orders> orders;
}
