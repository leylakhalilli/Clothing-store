package com.matrix.shopping.service;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.dao.repository.ClothesRepository;
import com.matrix.shopping.enums.ClothesCategory;
import com.matrix.shopping.mapping.ClothesMapper;
import com.matrix.shopping.model.ClothesDto;
import liquibase.pro.packaged.S;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothesService {
    private ClothesRepository clothesRepository;
//    private ClothesCategory category;

    public ClothesService(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    public List<ClothesEntity> findAll() {
        return clothesRepository.findAll();
    }

    public ClothesEntity findById(Integer id) {
        return clothesRepository.findById(id).get();
    }

    public List<ClothesDto> getClothesParametr() {
        return clothesRepository.findAll()
                .stream()
                .map(ClothesMapper.INSTANCE::entityDto)
                .collect(Collectors.toList());
    }

    public ClothesEntity getClothesParametr(Integer id) {
        return clothesRepository.findById(id).get();
    }

    public List<ClothesEntity> getClothesWomen() {
        List<ClothesEntity> showClothesWomen =
                clothesRepository.showClothesWomen();
        return showClothesWomen;
    }

    public List<ClothesEntity> getClothesMen() {
        List<ClothesEntity> showClothesMen =
                clothesRepository.showClothesMen();
        return showClothesMen;
    }

    public List<ClothesEntity> getClothesAccessories() {
        List<ClothesEntity> showClothesAccessories =
                clothesRepository.showClothesAccessories();
        return showClothesAccessories;
    }

    public List<ClothesEntity> getByCategoryWomen() {
        List<ClothesEntity> byCategoryWomen =
                clothesRepository.findByCategoryWomen(ClothesCategory.WOMEN);
        return byCategoryWomen;
    }

    public List<ClothesEntity> getByCategoryMen() {
        List<ClothesEntity> byCategoryMen =
                clothesRepository.findByCategoryMen(ClothesCategory.MEN);
        return byCategoryMen;
    }

    public List<ClothesEntity> getByCategoryAccessories() {
        List<ClothesEntity> byCategoryAccessories =
                clothesRepository.findByCategoryAccessories(ClothesCategory.ACCESSORIES);
        return byCategoryAccessories;
    }

    public void saveProduct(ClothesEntity clothesEntity) {
        clothesRepository.save(clothesEntity);
    }

    public void deleteProduct(Integer id) {
        clothesRepository.deleteById(id);
    }
}

