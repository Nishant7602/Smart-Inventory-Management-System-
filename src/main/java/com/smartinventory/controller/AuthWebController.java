package com.smartinventory.controller;

import com.smartinventory.entity.User;
import com.smartinventory.service.UserService;
import com.smartinventory.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AuthWebController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model,
                        HttpSession session) {

        User user = userService.login(username, password);
        if (user != null) {
            String token = JwtUtil.generateToken(user.getUsername());
            session.setAttribute("jwtToken", token);
            session.setAttribute("currentUser", user);
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid credentials!");
            return "login";
        }
    }
}