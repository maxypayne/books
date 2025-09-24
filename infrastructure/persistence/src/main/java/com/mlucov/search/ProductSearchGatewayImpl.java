package com.mlucov.search;

import com.mlucov.business.product.search.ProductSearchGateway;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.client.erhlc.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductSearchGatewayImpl implements ProductSearchGateway {

    private final ElasticsearchRestTemplate template;

    public ProductSearchGatewayImpl(ElasticsearchRestTemplate template) {
        this.template = template;
    }

    @Override
    public Page<ProductDocument> search(String keyword, int page, int size) {
        Criteria criteria = Criteria.where("name").matches(keyword)
            .or(Criteria.where("description").matches(keyword));

        Query query = new CriteriaQuery(criteria, PageRequest.of(page, size));

        SearchHits<ProductDocument> hits = template.search(query, ProductDocument.class);

        List<ProductDocument> content = hits.stream()
            .map(SearchHit::getContent)
            .toList();

        return new PageImpl<>(content, PageRequest.of(page, size), hits.getTotalHits());
    }

    @Override
    public void save(ProductDocument doc) {
        template.save(doc);
    }
}