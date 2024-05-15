package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.Order;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> { //db operations on Orders
}
