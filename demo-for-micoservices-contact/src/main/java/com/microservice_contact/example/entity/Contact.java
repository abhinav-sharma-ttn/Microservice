package com.microservice_contact.example.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private Long contactId;
    private String contactName;
    private String email;
    private Long userId;
}
