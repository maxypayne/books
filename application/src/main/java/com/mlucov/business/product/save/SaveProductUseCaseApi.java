package com.mlucov.business.product.save;

import com.mlucov.business.product.models.SaveProductInput;

public interface SaveProductUseCaseApi {
    Long createProduct(SaveProductInput input);
    Long updateProduct(SaveProductInput input, Long id);
}
