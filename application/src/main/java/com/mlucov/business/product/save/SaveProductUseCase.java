package com.mlucov.business.product.save;

import com.mlucov.business.category.CategoryRepository;
import com.mlucov.business.product.ProductRepository;
import com.mlucov.business.product.models.SaveProductInput;
import com.mlucov.business.upload.ImageStorageGateway;
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
    public Long createProduct(SaveProductInput input) {
        Product product = new Product();
        return this.saveProduct(input, product);
    }

    @Override
    public Long updateProduct(SaveProductInput input, Long id) {
        Product product = this.productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return this.saveProduct(input, product);
    }


    private String uploadImage(MultipartFile file) {
        try {
            return this.imageStorageGateway.upload(file);
        } catch (Exception e) {
//            e.getMessage();
            throw new RuntimeException(e);
        }
    }
    private Category getCategoryById(Short id) {
        return this.categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }
    public Long saveProduct(SaveProductInput input, Product product) {
        product.setName(input.name());
        product.setDescription(input.description());
        product.setPrice(input.price());
        product.setSku(input.sku());
        product.setImageUrl(this.uploadImage(input.file()));
        product.setCategory(this.getCategoryById(input.categoryId()));
        product.setBrand(input.brand());
        product.setStockQuantity(product.getStockQuantity() != null ? this.updateStockQuantity(product) : 0);

        return this.productRepository.save(product).getId();
    }
}
