package ru.aston.service;

import ru.aston.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(long id);
    OrderDTO addOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(long id, OrderDTO orderDTO);
    boolean deleteOrder(long id);
}
