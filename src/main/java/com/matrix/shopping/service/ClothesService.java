package com.matrix.shopping.service;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.dao.repository.ClothesRepository;
import com.matrix.shopping.mapping.ClothesMapper;
import com.matrix.shopping.model.ClothesDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothesService {
    private ClothesRepository clothesRepository;

    public ClothesService(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
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

    public List<ClothesEntity> getByCategoryWomen() {
        List<ClothesEntity> byCategoryWomen =
                clothesRepository.findByCategoryWomen();
        return byCategoryWomen;
    }

    public List<ClothesEntity> getByCategoryMen() {
        List<ClothesEntity> byCategoryMen =
                clothesRepository.findByCategoryMen();
        return byCategoryMen;
    }

    public List<ClothesEntity> getByCategoryAccessories() {
        List<ClothesEntity> byCategoryAccessories =
                clothesRepository.findByCategoryAccessories();
        return byCategoryAccessories;
    }
}

