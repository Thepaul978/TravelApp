package com.example.travelapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/public/welcome")
    public String welcome() {
        return "Welcome to the public area!";
    }

    @GetMapping("/protected/resource")
    public String protectedResource() {
        return "This is a protected resource!";
    }
}
