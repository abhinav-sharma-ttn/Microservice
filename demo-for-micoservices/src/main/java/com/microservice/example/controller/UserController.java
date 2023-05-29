package com.microservice.example.controller;

import com.microservice.example.entity.User;
import com.microservice.example.service.service_impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/get-user/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
//        User user = userService.getUser(userId);
//        restTemplate.getForObject()
        return userService.getUser(userId);
    }
}
