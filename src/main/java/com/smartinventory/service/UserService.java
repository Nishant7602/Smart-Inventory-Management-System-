package com.smartinventory.service;
import java.util.List;   // ✅ CORRECT
import com.smartinventory.entity.User;

public interface UserService {
	List<User> getAllUsers();
    User login(String username, String password);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    void saveUser(User user);
}