package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.model.Address;

import java.util.List;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
    List<AddressDTO> getAddressesById(UUID userId);
}
