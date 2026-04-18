package com.smartinventory.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartinventory.entity.User;
import com.smartinventory.service.UserService;

public class LoginController{
	@Autowired 
	UserService userService;
@PostMapping("/login")
public String login(@RequestParam String email,
                    @RequestParam String password,
                    HttpSession session) {

    User user = userService.login(email, password);

    if (user != null) {
        session.setAttribute("user", user);
        return "redirect:/dashboard";
    }

    return "login";
}}