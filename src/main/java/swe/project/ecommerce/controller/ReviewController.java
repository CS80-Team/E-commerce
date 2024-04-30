package swe.project.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.ReviewDTO;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createReview(@RequestBody ReviewDTO reviewDTO) {
        reviewService.createReview(reviewDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable UUID id) {
        reviewService.deleteReviewById(id);
    }
}
