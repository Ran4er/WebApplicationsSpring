package ru.aston.dao;

import ru.aston.entity.Order;
import java.util.List;

public interface OrderDAO {
    List<Order> getAllOrders();
    Order getOrderById(long id);
    void addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(long id);
}