package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.Address;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
