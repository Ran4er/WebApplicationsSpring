package ru.aston.WebApplication.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Orders {
    
    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GeneratedValue.IDENTITY)
    private long id;

    @Column(name="quantity")
    private int quantity;

    @OneToMany
    @JoinColumn()

    @ManyToOne
    @JoinColumn()

    
    
}
