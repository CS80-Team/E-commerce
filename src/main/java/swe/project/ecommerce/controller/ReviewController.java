package swe.project.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.model.Review;
import swe.project.ecommerce.service.ReviewService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/e-commerce/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<ReviewDTO> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public List<ReviewDTO> getAllReviewsByUserId(@PathVariable UUID id) {
        return reviewService.getAllReviewsByUserId(id);
    }
}
