package swe.project.ecommerce.mapper;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.model.Review;

@Service
public class ReviewMapper {
    public static ReviewDTO mapToReviewDTO(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getTitle(),
                review.getBody()
        );
    }

    public static Review mapToReview(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setId(reviewDTO.id());
        review.setTitle(reviewDTO.title());
        review.setBody(reviewDTO.body());
        return review;
    }
}
