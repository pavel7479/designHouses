package com.example.designHouses.controllers;

import com.example.designHouses.Repository.UserRepository;
import com.example.designHouses.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesignController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/start")
    public String startDesign (Model model) {
        Iterable<Users> users = userRepository.findAll();
        model.addAttribute("users",users);
        return "start";
    }
}
