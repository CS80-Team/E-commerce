package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swe.project.ecommerce.model.ProdDetails;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdDetailsRepository extends JpaRepository<ProdDetails, UUID> {

    List<ProdDetails> findByProductId(UUID productId);
}
