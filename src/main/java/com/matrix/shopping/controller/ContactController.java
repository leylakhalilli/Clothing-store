package com.matrix.shopping.controller;

import com.matrix.shopping.model.ContactDto;
import com.matrix.shopping.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/")
    public void saveContact(@RequestBody ContactDto contactDto) {
        contactService.saveContact(contactDto);
    }

}
