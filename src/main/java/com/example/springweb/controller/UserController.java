package com.example.springweb.controller;

import com.example.springweb.model.Hello;
import com.example.springweb.model.User;
import com.example.springweb.model.Usera;
import com.example.springweb.service.HelloService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("Validation Error Count " + bindingResult.getErrorCount());
            return "newUser";
        }
        // let's imagine we have persisted user object
        System.out.println("User saved " + user);
        return "redirect:/user/new";
    }
}
