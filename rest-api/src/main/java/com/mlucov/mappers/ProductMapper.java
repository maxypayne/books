package com.mlucov.mappers;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.product.query.ProductCardOutput;
import com.mlucov.business.product.query.ProductDetailsOutput;
import com.mlucov.models.request.SaveProductRequest;
import com.mlucov.models.response.PaginatedResponse;
import com.mlucov.models.response.ProductCardResponse;
import com.mlucov.models.response.ProductDetailsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    SaveProductInput toSaveProductInput(SaveProductRequest saveProductInput);
    ProductDetailsResponse toProductDetailsResponse(ProductDetailsOutput productDetailsOutput);
    PaginatedResponse<ProductCardResponse> toProductsListResponse(PaginatedOutput<ProductCardOutput> productCardOutput);
}
