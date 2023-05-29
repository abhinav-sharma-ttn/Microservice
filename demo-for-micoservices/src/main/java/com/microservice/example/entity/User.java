package com.microservice.example.entity;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    private String name;
    private String phoneNumber;
    private Long userId;
    private List<Contact> allContacts = new ArrayList<>();

    public User(String abhinavSharma, String s, long l) {
    }
}
