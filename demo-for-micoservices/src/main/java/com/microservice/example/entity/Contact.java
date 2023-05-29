package com.microservice.example.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private Long contactId;
    private String email;
    private String contactName;
    private Long userId;

}
