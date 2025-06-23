package com.mlucov.mappers;

import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.models.request.SaveProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    public SaveProductInput toSaveProductInput(SaveProductRequest saveProductInput);
}
