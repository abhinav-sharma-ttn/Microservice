package com.microservice.example.service.service_impl;

import com.microservice.example.entity.User;
import com.microservice.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> allUsers = List.of(
            new User("Abhinav Sharma", "9876XXXXXX", 1L),
            new User("Pappu Yadav", "9846XXXXXX", 2L),
            new User("Shakku", "9876X4XXXX", 3L)
    );

    @Override
    public User getUser(Long id) {
        return allUsers
                .stream()
                .filter(user -> user.getUserId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
