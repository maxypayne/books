package com.mlucov.business.product.search;

import com.mlucov.search.ProductDocument;
import org.springframework.data.domain.Page;

public interface ProductSearchGateway {
    Page<ProductDocument> search(String keyword, int page, int size);
    void save(ProductDocument doc); // pour indexation
}
