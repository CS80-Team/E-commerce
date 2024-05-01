package swe.project.ecommerce.mapper.impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.mapper.Mapper;
import swe.project.ecommerce.model.Review;

@Service
public class ReviewMapper implements Mapper<Review, ReviewDTO> {
    @Override
    public Review mapToEntity(ReviewDTO reviewDTO) {
        return new Review(
                reviewDTO.id(),
                reviewDTO.title(),
                reviewDTO.body()
        );
    }

    @Override
    public ReviewDTO mapToDTO(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getTitle(),
                review.getBody()
        );
    }
}
