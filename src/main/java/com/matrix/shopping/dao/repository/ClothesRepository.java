package com.matrix.shopping.dao.repository;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.enums.ClothesCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClothesRepository extends JpaRepository<ClothesEntity, Integer> {
//    List<ClothesEntity> findAll();
////
////
////    @Query(value = "SELECT *from clothes where clothes_category='WOMEN'", nativeQuery = true)
////    List<ClothesEntity> findByCategoryWomen();
//
//    @Query(value = "SELECT *from clothes where clothes_category='MEN'", nativeQuery = true)
//    List<ClothesEntity> findByCategoryMen();
//
//    @Query(value = "SELECT *from clothes where clothes_category='ACCESSORIES'", nativeQuery = true)
//    List<ClothesEntity> findByCategoryAccessories();

    @Query(value = "SELECT * FROM  clothes"
            + " WHERE clothes_category='WOMEN'" +
            "  LIMIT 4 ",
            nativeQuery = true)
    List<ClothesEntity> showClothesWomen();

    @Query(value = "SELECT * FROM  clothes"
            + " WHERE clothes_category='MEN'" +
            "  LIMIT 4 ",
            nativeQuery = true)
    List<ClothesEntity> showClothesMen();


    @Query(value = "SELECT * FROM  clothes"
            + " WHERE clothes_category='ACCESSORIES'" +
            "  LIMIT 4 ",
            nativeQuery = true)
    List<ClothesEntity> showClothesAccessories();


    @Query(value = "select c from ClothesEntity c where c.category=:WOMEN")
    List<ClothesEntity> findByCategoryWomen(ClothesCategory WOMEN);

    @Query(value = "select c from ClothesEntity c where c.category=:MEN ")
    List<ClothesEntity> findByCategoryMen(ClothesCategory MEN);

    @Query(value = "select c from ClothesEntity c where c.category=:ACCESSORIES")
    List<ClothesEntity> findByCategoryAccessories(ClothesCategory ACCESSORIES);
//
}
