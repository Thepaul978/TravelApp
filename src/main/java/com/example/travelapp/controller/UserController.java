package com.example.travelapp.controller;

import com.example.travelapp.exception.UserNotFoundException;
import com.example.travelapp.model.User;
import com.example.travelapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> userList = userService.getAllUsers();
        return userList;
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getid/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            throw new UserNotFoundException("User not found for id: " + id);
        }
        return user;
    }
}
