package com.mlucov.repository.rating;

import com.mlucov.business.rating.RatingRepository;
import com.mlucov.entities.Rating;

import java.util.Optional;

public class RatingRepositoryImpl implements RatingRepository {
    private final RatingJpaRepository repository;

    public RatingRepositoryImpl(RatingJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Rating> findByProductId(Long productId) {
        return repository.findByProductId(productId);
    }

    @Override
    public Rating save(Rating rating) {
        return null;
    }
}
