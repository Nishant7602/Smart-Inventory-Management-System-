package com.smartinventory.dao;

import com.smartinventory.entity.User;

import java.util.List;

public interface UserDAO {

    User findByUsernameAndPassword(String username, String password);
    List<User> findAll();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}