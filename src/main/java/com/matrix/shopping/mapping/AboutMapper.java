package com.matrix.shopping.mapping;

import com.matrix.shopping.dao.entity.AboutEntity;
import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.model.AboutDto;
import com.matrix.shopping.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AboutMapper {

    AboutMapper INSTANCE = Mappers.getMapper(AboutMapper.class);

    AboutDto aboutToDto(AboutEntity aboutEntity);
}
