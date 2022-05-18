package com.matrix.shopping.mapping;

import com.matrix.shopping.dao.entity.ContactEntity;
import com.matrix.shopping.model.ContactDto;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {
    public ContactEntity contactEntityDto(ContactDto contactDto) {
        return new ContactEntity(contactDto.getName(),contactDto.getEmail(),contactDto.getPhone(),contactDto.getMessage());
    }
}
