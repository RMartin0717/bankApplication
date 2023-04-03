package com.practice.bankApplication.controller;

import com.practice.bankApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
public class UserController {

    private UserService userService;

    @PostMapping("/createUser")
    public void createUser(@RequestParam String firstName, String lastName, String email) {
        userService.createUser(firstName, lastName, email);
    }
}
