package com.mlucov.repository.rating;

import com.mlucov.models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RatingJpaRepository extends JpaRepository<Rating, Long> {
    Optional<Rating> findByProductId(Long productId);
}
