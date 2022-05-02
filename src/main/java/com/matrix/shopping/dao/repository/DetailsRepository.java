package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.ProductDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository extends JpaRepository<ProductDetailsEntity,Integer> {
}
