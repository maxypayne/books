package com.mlucov.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
//    private final RatingService ratingService;
//
//    public RatingController(RatingService ratingService) {
//        this.ratingService = ratingService;
//    }
//
//    @PostMapping("/{productId}")
//    public ResponseEntity<Void> rateProduct(
//        @PathVariable Long productId,
//        @RequestBody RatingRequest request,
//        @AuthenticationPrincipal User user
//    ) {
//        ratingService.rateProduct(productId, user, request.getScore(), request.getComment());
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/{productId}/average")
//    public ResponseEntity<Double> getAverageRating(@PathVariable Long productId) {
//        return ResponseEntity.ok(ratingService.getAverageRating(productId));
//    }
}