package com.matrix.shopping.mapping;

import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mappings(@Mapping(source = "name", target = "name"))

    Product entityToDto(ProductEntity productEntity);


}
