package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {
}
