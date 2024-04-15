package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swe.project.ecommerce.model.ProductDetails;

import java.util.UUID;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, UUID> {
}
