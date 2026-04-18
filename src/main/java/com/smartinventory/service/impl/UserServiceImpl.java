package com.smartinventory.service.impl;

import com.smartinventory.dao.UserDAO;
import com.smartinventory.entity.User;
import com.smartinventory.service.UserService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username, password);
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();   // 🔥 important
    }
    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
}