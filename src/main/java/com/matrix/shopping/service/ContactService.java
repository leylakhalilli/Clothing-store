package com.matrix.shopping.service;

import com.matrix.shopping.dao.repository.ContactRepository;
import com.matrix.shopping.mapping.ContactMapper;
import com.matrix.shopping.model.ContactDto;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private ContactRepository contactRepository;
    private ContactMapper contactMapper;

    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    public boolean saveContact(ContactDto contactDto) {
        contactRepository.save(contactMapper.contactEntityDto(contactDto));
        return true;
    }
}
