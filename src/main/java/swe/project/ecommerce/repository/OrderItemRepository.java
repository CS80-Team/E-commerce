package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.OrderItem;

import java.util.UUID;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
}
