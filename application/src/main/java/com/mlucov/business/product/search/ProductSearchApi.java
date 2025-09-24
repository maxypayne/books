package com.mlucov.business.product.search;

import com.mlucov.business.PaginatedOutput;

public interface ProductSearchApi {
    PaginatedOutput<ProductDocumentOutput> search(String keyword, int page, int size);

    void save(ProductDocumentInput input);
}
