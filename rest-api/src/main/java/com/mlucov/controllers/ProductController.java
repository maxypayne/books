package com.mlucov.controllers;

import com.mlucov.business.product.ProductRepository;
import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.product.save.SaveProductUseCaseApi;
import com.mlucov.mappers.ProductMapper;
import com.mlucov.models.request.SaveProductRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final SaveProductUseCaseApi saveProductUseCaseApi;

    public ProductController(SaveProductUseCaseApi saveProductUseCaseApi) {
        this.saveProductUseCaseApi = saveProductUseCaseApi;
    }

    @PostMapping("/create")
    public Long create(@ModelAttribute SaveProductRequest request) {
       SaveProductInput input = ProductMapper.INSTANCE.toSaveProductInput(request);
       return this.saveProductUseCaseApi.createProduct(input);
    }
    @PostMapping("/update/{id}")
    public Long create(@ModelAttribute SaveProductRequest request, @PathVariable Long id) {
       SaveProductInput input = ProductMapper.INSTANCE.toSaveProductInput(request);
       return this.saveProductUseCaseApi.updateProduct(input, id);
    }
}
