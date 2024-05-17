package ru.aston.mapper;

import org.mapstruct.Mapper;

import ru.aston.dto.UserDTO;
import ru.aston.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
