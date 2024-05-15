package swe.project.ecommerce.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ReviewDTO;
import swe.project.ecommerce.mapper.impl.ReviewMapper;
import swe.project.ecommerce.repository.ReviewRepository;
import swe.project.ecommerce.service.CrudService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements CrudService<ReviewDTO> {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;
    }


    @Override
    public void create(ReviewDTO entityDTO) {
        reviewRepository.save(reviewMapper.mapToEntity(entityDTO));
    }

    @Override
    public List<ReviewDTO> getAllEntities() {
        return reviewRepository.findAll().stream().map(reviewMapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public List<ReviewDTO> getAllEntitiesById(UUID entityId) {
        return reviewRepository.getReviewsByUserId(entityId);
    }

    @Override
    public ReviewDTO getEntityById(UUID entityId) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateEntity(UUID entityUuid, ReviewDTO entityDto) {
        return null;
    }

    @Override
    public void deleteEntity(UUID entityUuid) {
        reviewRepository.deleteById(entityUuid);
    }
}
