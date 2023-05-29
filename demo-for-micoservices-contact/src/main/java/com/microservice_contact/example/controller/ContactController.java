package com.microservice_contact.example.controller;

import com.microservice_contact.example.entity.Contact;
import com.microservice_contact.example.service.ContactService;
import com.microservice_contact.example.service.service_impl.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/contact_service")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(path = "/get-contact/{userId}")
    public List<Contact> getAllContacts(@PathVariable("userId") Long userId) {
        return contactService.getAllContactsOfUser(userId);
    }
}
