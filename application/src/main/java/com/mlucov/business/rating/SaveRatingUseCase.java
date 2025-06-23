package com.mlucov.business.rating;

import com.mlucov.business.product.ProductRepository;
import com.mlucov.entities.Product;
import com.mlucov.entities.Rating;
import com.mlucov.entities.User;

import java.util.Optional;

public class SaveRatingUseCase {
    private final RatingRepository ratingRepository;
    private final ProductRepository productRepository;

    public SaveRatingUseCase(RatingRepository ratingRepo, ProductRepository productRepo) {
        this.ratingRepository = ratingRepo;
        this.productRepository = productRepo;
    }

    public void rateProduct(Long productId, User user, int score, String comment) {
        Product product = productRepository.findById(productId)
            .orElseThrow(() -> new RuntimeException("Produit non trouvé"));

        Optional<Rating> existing = ratingRepository.findByProductId(product.getId());
        Rating rating = existing.orElse(new Rating());
        rating.setUser(user);
        rating.setProduct(product);
        rating.setScore(score);
//        rating.setComment(comment);
        ratingRepository.save(rating);
    }

    public double getAverageRating(Long productId) {
        Product product = productRepository.findById(productId)
            .orElseThrow(() -> new RuntimeException("Produit non trouvé"));
        return product.getAverageRating();
    }
}
