package swe.project.ecommerce.service.Impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.mapper.ReviewMapper;
import swe.project.ecommerce.repository.ReviewRepository;
import swe.project.ecommerce.service.ReviewService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;


    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        return reviewRepository.findAll().stream().map(ReviewMapper::mapToReviewDTO).collect(Collectors.toList());
    }

    @Override
    public void createReview(ReviewDTO reviewDTO) {
        reviewRepository.save(ReviewMapper.mapToReview(reviewDTO));
    }

    @Override
    public void deleteReviewById(UUID id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public List<ReviewDTO> getAllReviewsByUserId(UUID id) {
        return reviewRepository.getReviewsByUserId(id);
    }
}
