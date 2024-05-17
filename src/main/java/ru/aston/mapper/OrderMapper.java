package ru.aston.mapper;

import org.mapstruct.Mapper;

import ru.aston.dto.OrderDTO;
import ru.aston.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDTO(Order order);
    Order toEntity(OrderDTO orderDTO);
}
