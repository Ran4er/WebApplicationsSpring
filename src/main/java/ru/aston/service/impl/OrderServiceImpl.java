package ru.aston.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aston.dto.OrderDTO;
import ru.aston.entity.Order;
import ru.aston.mapper.OrderMapper;
import ru.aston.repository.OrderRepository;
import ru.aston.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDTO getOrderById(long id) {
        return orderRepository.findById(id)
                .map(orderMapper::toDTO)
                .orElse(null);
    }

    @Override
    public OrderDTO addOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        return orderMapper.toDTO(orderRepository.save(order));
    }

    @Override
    public OrderDTO updateOrder(long id, OrderDTO orderDTO) {
        if (orderRepository.existsById(id)) {
            Order order = orderMapper.toEntity(orderDTO);
            order.setId(id);
            return orderMapper.toDTO(orderRepository.save(order));
        }
        return null;
    }

    @Override
    public boolean deleteOrder(long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
