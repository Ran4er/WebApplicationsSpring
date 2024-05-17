package ru.aston.service;

import ru.aston.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(long id);
    UserDTO addUser(UserDTO userDTO);
    UserDTO updateUser(long id, UserDTO userDTO);
    boolean deleteUser(long id);
}
