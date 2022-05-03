package com.matrix.shopping.mapping;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.model.ClothesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClothesMapper {
    ClothesMapper INSTANCE = Mappers.getMapper(ClothesMapper.class);

    ClothesDto entityDto(ClothesEntity clothesEntity);
}
