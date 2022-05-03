package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.AboutEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AboutRepository extends CrudRepository<AboutEntity, Integer> {
    Optional<AboutEntity> findById(Integer id);

}
