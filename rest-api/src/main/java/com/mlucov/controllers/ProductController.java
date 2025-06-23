package com.mlucov.controllers;

import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.product.query.ProductCardOutput;
import com.mlucov.business.product.query.ProductQueryApi;
import com.mlucov.business.product.save.SaveProductUseCaseApi;
import com.mlucov.mappers.ProductMapper;
import com.mlucov.models.request.SaveProductRequest;
import com.mlucov.models.response.ProductDetailsResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final SaveProductUseCaseApi saveProductUseCaseApi;
    private final ProductQueryApi productQueryApi;

    public ProductController(SaveProductUseCaseApi saveProductUseCaseApi, ProductQueryApi productQueryApi) {
        this.saveProductUseCaseApi = saveProductUseCaseApi;
        this.productQueryApi = productQueryApi;
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

    @GetMapping("/{id}")
    public ProductDetailsResponse getProductById(@PathVariable Long id) {
        ProductCardOutput output = this.productQueryApi.getProductById(id);
        return new ProductDetailsResponse(output.id());
    }
}
