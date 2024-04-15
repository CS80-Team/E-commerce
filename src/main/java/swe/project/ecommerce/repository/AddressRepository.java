package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
