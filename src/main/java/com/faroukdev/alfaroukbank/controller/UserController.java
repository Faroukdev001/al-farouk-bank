package com.faroukdev.alfaroukbank.controller;


import com.faroukdev.alfaroukbank.dto.BankResponse;
import com.faroukdev.alfaroukbank.dto.UserRequest;
import com.faroukdev.alfaroukbank.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

}
