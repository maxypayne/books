package com.mlucov.business.product.save;

import com.mlucov.business.product.models.SaveProductInput;

public interface SaveProductUseCaseApi {
    Integer createProduct(SaveProductInput input);
    Integer updateProduct(SaveProductInput input, Integer id);
}
