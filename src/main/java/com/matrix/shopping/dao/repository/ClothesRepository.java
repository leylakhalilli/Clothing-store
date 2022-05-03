package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.ClothesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClothesRepository extends JpaRepository<ClothesEntity, Integer> {
    List<ClothesEntity> findAll();


    @Query(value = "SELECT *from clothes where clothes_category='women'", nativeQuery = true)
    List<ClothesEntity> findByCategoryWomen();

    @Query(value = "SELECT *from clothes where clothes_category='men'", nativeQuery = true)
    List<ClothesEntity> findByCategoryMen();

    @Query(value = "SELECT *from clothes where clothes_category='accessories'", nativeQuery = true)
    List<ClothesEntity> findByCategoryAccessories();

}
