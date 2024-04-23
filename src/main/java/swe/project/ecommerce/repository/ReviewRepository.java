package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.model.Review;

import java.util.List;
import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
    List<ReviewDTO> getReviewsByUserId(UUID userId);
}
