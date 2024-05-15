package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swe.project.ecommerce.model.Product;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {}
