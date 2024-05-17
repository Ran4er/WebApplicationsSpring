package ru.aston.dto;

import java.util.List;
import java.util.Objects;

import ru.aston.entity.Book;
import ru.aston.entity.User;

public class OrderDTO {

    private long id;
    private User user;
    private int quantity;
    private List<Book> books;
    
    public OrderDTO(long id, User user, int quantity, List<Book> books) {
        this.id = id;
        this.user = user;
        this.quantity = quantity;
        this.books = books;
    }
    
    public long getId() {
        return id;
    }
    
    public User getUser() {
        return user;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getBooks(), getId(), getQuantity(), getUser());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OrderDTO other = (OrderDTO) obj;
        if (id != other.id)
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        if (quantity != other.quantity)
            return false;
        if (books == null) {
            if (other.books != null)
                return false;
        } else if (!books.equals(other.books))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "OrdersDTO [id=" + id + ", user=" + user + ", quantity=" + quantity + ", books=" + books + "]";
    }

}
