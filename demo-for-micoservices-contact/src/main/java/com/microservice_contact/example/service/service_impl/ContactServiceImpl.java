package com.microservice_contact.example.service.service_impl;

import com.microservice_contact.example.entity.Contact;
import com.microservice_contact.example.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    List<Contact> allContacts = List.of(
            new Contact(1L, "Abhinav Sharma", "abhinav.sharma@mail.com", 1L),
            new Contact(2L, "Pappu", "pappu.1@mail.com", 2L),
            new Contact(3L, "Shakku", "shakku.1@mail.com", 3L),
            new Contact(4L, "Shakku2", "shakku2.1@mail.com", 3L)
    );

    @Override
    public List<Contact> getAllContactsOfUser(Long userId) {

        return allContacts
                .stream()
                .filter(contact -> contact.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
