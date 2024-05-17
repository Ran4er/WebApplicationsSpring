package ru.aston.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import ru.aston.entity.Order;

public class UserDTO {

    private long id;
    private String username;
    private String name;
    private String surname;
    private char[] password;
    private List<Order> orders;
    
    public UserDTO(long id, String username, String name, String surname, char[] password, List<Order> orders) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.orders = orders;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char[] getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOrders(), getPassword(), getUsername(), getSurname());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        UserDTO other = (UserDTO) obj;
        if (id != other.id)
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        if (!Arrays.equals(password, other.password))
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
        return "UserDTO [id=" + id + ", username=" + username + ", name=" + name + ", surname=" + surname
                + ", password=" + Arrays.toString(password) + ", orders=" + orders + "]";
    }

}
