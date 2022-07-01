package com.matrix.shopping.mapping;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.model.ClothesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ClothesMapper {
    ClothesMapper INSTANCE = Mappers.getMapper(ClothesMapper.class);

    ClothesDto entityDto(ClothesEntity clothesEntity);

//   public ClothesDto entityDto(ClothesDto clothesDto){
//        return new ClothesDto(
//                clothesDto.getId(),
//                clothesDto.getClothesName(),
//                clothesDto.getClothesImg(),
//                clothesDto.getClothesPrice(),
//                clothesDto.getClothesCategory(),
//                clothesDto.getDescription()
//        );
//    }

}
