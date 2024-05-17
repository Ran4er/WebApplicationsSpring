package ru.aston.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private char[] password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    public User() {
    }

    public User(String name, String surname, String username, char[] password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOrders(), getPassword(), getSurname(), getUsername());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User user)) return false;
        return getId() == user.getId() && getName() == user.getName() &&
                getOrders() == user.getOrders() && getPassword() == user.getPassword() &&
                getSurname() == user.getSurname() && getUsername() == user.getUsername();
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", username=" + username + ", password="
                + Arrays.toString(password) + ", orders=" + orders + "]";
    }

}
