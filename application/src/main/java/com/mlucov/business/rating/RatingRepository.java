package com.mlucov.business.rating;

import com.mlucov.models.Product;
import com.mlucov.models.Rating;
import com.mlucov.models.User;

import java.util.Optional;

public interface RatingRepository {
    Optional<Rating> findByProductId(Long productId);
    Rating save(Rating rating);
}
