package com.mlucov.business.product.query;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.business.product.ProductRepository;
import com.mlucov.business.product.models.GetProductsInput;
import com.mlucov.entities.Product;
import com.mlucov.models.Paginated;
import org.springframework.stereotype.Component;

@Component
public class ProductQuery implements ProductQueryApi {
    private final ProductRepository repository;

    public ProductQuery(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public PaginatedOutput<ProductCardOutput> getProducts(GetProductsInput input) {
        Paginated<Product> paginated = this.repository.findAll(input);
        return new PaginatedOutput<>(
            paginated.total(),
            paginated.data().stream().map(product -> new ProductCardOutput(
                product.getId(),
                product.getImageUrl(),
                product.getName(),
                product.getDescription()
            )).toList()
        );
    }

    @Override
    public ProductDetailsOutput getProductById(long id) {
        Product product = this.repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return new ProductDetailsOutput(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getStockQuantity(),
            product.getImageUrl(),
            product.getBrand(),
            product.isActive(),
            product.getCategory().getName(),
            product.getAverageRating()
        );
    }
}
