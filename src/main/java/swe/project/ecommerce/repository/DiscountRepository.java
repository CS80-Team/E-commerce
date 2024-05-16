package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.Discount;

import java.util.UUID;

public interface DiscountRepository extends JpaRepository<Discount, UUID> {
    Discount findByProductId(UUID productId);
}
