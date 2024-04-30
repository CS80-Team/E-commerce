package swe.project.ecommerce.service;

import swe.project.ecommerce.dto.AddressDTO;

import java.util.List;
import java.util.UUID;

public interface AddressService {
    List<AddressDTO> getAllAddresses();

    List<AddressDTO> getAllAddressesByUserId(UUID id);
}
