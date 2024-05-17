package ru.aston.dao;

import ru.aston.entity.User;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
}
