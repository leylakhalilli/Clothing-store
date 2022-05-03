package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.DetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<DetailsEntity,Integer> {
}
