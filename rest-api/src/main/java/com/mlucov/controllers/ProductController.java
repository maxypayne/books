package com.mlucov.controllers;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.business.product.models.GetProductsInput;
import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.product.query.ProductCardOutput;
import com.mlucov.business.product.query.ProductDetailsOutput;
import com.mlucov.business.product.query.ProductQueryApi;
import com.mlucov.business.product.save.SaveProductUseCaseApi;
import com.mlucov.mappers.ProductMapper;
import com.mlucov.models.request.SaveProductRequest;
import com.mlucov.models.response.PaginatedResponse;
import com.mlucov.models.response.ProductCardResponse;
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

    @GetMapping()
    public PaginatedResponse<ProductCardResponse> getProducts(
        @RequestParam(defaultValue = "0") Integer page,
        @RequestParam(defaultValue = "30") Integer size
    ) {
        GetProductsInput input = new GetProductsInput(page, size);
        PaginatedOutput<ProductCardOutput> output = this.productQueryApi.getProducts(input);
        return ProductMapper.INSTANCE.toProductsListResponse(output);
    }

    @GetMapping("/{id}")
    public ProductDetailsResponse getProductById(@PathVariable Long id) {
        ProductDetailsOutput output = this.productQueryApi.getProductById(id);
        return ProductMapper.INSTANCE.toProductDetailsResponse(output);
    }
}
