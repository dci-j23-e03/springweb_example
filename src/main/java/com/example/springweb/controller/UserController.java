package com.example.springweb.controller;

import com.example.springweb.model.Hello;
import com.example.springweb.model.User;
import com.example.springweb.model.Usera;
import com.example.springweb.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/new")
    public String newUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        System.out.println("New User: " + user);
        return "newUser";
    }

    @PostMapping("/save")
    public String saveUser(User usera){
        // let's imagine we have persisted user object
        System.out.println("User saved " + usera);
        return "redirect:/user/new";
    }
}
