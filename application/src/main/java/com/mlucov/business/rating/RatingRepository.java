package com.mlucov.business.rating;

import com.mlucov.entities.Rating;

import java.util.Optional;

public interface RatingRepository {
    Optional<Rating> findByProductId(Long productId);
    Rating save(Rating rating);
}
