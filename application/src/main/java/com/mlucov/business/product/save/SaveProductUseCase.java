package com.mlucov.business.product.save;

import com.mlucov.business.category.CategoryRepository;
import com.mlucov.business.product.ProductRepository;
import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.save.ImageStorageGateway;
import com.mlucov.models.Category;
import com.mlucov.models.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Transactional
public class SaveProductUseCase implements SaveProductUseCaseApi {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ImageStorageGateway imageStorageGateway;

    public SaveProductUseCase(ProductRepository productRepository, CategoryRepository categoryRepository, ImageStorageGateway imageStorageGateway) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.imageStorageGateway = imageStorageGateway;
    }

    private Integer updateStockQuantity(Product product) {
        // todo
        return product.getStockQuantity() + 1;
    }

    @Override
    public Integer createProduct(SaveProductInput input) {
        Product product = new Product();
        return this.saveProduct(input, product);
    }

    @Override
    public Integer updateProduct(SaveProductInput input, Integer id) {
        Product product = this.productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return this.saveProduct(input, product);
    }


    private String uploadImage(MultipartFile file) {
        try {
            return this.imageStorageGateway.upload(file);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    private Category getCategoryById(Short id) {
        return this.categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }
    public Integer saveProduct(SaveProductInput input, Product product) {
        product.setName(input.name());
        product.setDescription(input.description());
        product.setPrice(input.price());
        product.setSku(input.sku());
        product.setStockQuantity(this.updateStockQuantity(product));
        product.setImageUrl(this.uploadImage(input.image()));
        product.setCategory(this.getCategoryById(input.categoryId()));
        product.setBrand(input.brand());

        return this.productRepository.save(product).getId();
    }
}
