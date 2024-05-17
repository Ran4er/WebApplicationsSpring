package ru.aston.dto;

import java.util.List;
import java.util.Objects;

import ru.aston.entity.Order;

public class BookDTO {
    
    private int id;
    private String title;
    private double price;
    private String author;
    private List<Order> orders;
    
    public BookDTO(int id, String title, double price, String author, List<Order> orders) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.orders = orders;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public List<Order> getOrders() {
        return orders;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getId(), getOrders(), getPrice(), getTitle());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookDTO other = (BookDTO) obj;
        if (id != other.id)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (orders == null) {
            if (other.orders != null)
                return false;
        } else if (!orders.equals(other.orders))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "BookDTO [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", orders="
                + orders + "]";
    }
    
}
