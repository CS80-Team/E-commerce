package swe.project.ecommerce.service;

import swe.project.ecommerce.dto.ReviewDTO;

import java.util.List;
import java.util.UUID;

public interface ReviewService {
    List<ReviewDTO> getAllReviewsByUserId(UUID id);

    List<ReviewDTO> getAllReviews();
}
