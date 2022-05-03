package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    //   ProductEntity findByName(String name);
    @Query(value = "select *from shopping_product where name=? and id=?", nativeQuery = true)
//sql
    Optional<ProductEntity> selectByName(String name, Integer id);

    @Query(value = "select p from ProductEntity p where p.name=:name and p.id=:id", nativeQuery = false)
    Optional<ProductEntity> selectByNameJpql(String name, Integer id);


}
