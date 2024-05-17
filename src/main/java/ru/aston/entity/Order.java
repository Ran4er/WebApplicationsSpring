package ru.aston.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema="tool_box")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "quantity")
    private int quantity;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private List<Book> books;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {
    }

    public Order(int quantity, List<Book> books, User user) {
        this.quantity = quantity;
        this.books = books;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return getId() == order.getId() &&
               getQuantity() == order.getQuantity() &&
               Objects.equals(getBooks(), order.getBooks()) &&
               Objects.equals(getUser(), order.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuantity(), getBooks(), getUser());
    }

    @Override
    public String toString() {
        return "Order{" +
               "id=" + id +
               ", quantity=" + quantity +
               ", books=" + books +
               ", user=" + user +
               '}';
    }
}
