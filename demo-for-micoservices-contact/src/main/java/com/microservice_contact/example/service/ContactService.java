package com.microservice_contact.example.service;

import com.microservice_contact.example.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getAllContactsOfUser(Long userId);
}
