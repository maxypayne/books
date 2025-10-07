package com.mlucov.business.product.search;

import com.mlucov.business.PaginatedOutput;
import com.mlucov.search.ProductDocument;
import org.springframework.data.domain.Page;

public class ProductSearchQuery implements ProductSearchApi {

    private final ProductSearchGateway productSearchGateway;

    public ProductSearchQuery(ProductSearchGateway productSearchGateway) {
        this.productSearchGateway = productSearchGateway;
    }

    @Override
    public PaginatedOutput<ProductDocumentOutput> search(String keyword, int page, int size) {
        Page<ProductDocument> products = productSearchGateway.search(keyword, page, size);
        return null;
    }

    @Override
    public void save(ProductDocumentInput input) {

    }
}
