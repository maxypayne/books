package com.mlucov.business.product.query;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.business.product.models.GetProductsInput;

public interface ProductQueryApi {
    PaginatedOutput<ProductCardOutput> getProducts(GetProductsInput input);
    ProductDetailsOutput getProductById(long id);
}
