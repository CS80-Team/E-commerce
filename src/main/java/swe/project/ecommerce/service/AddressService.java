package swe.project.ecommerce.service;

import swe.project.ecommerce.dto.AddressDTO;

import java.util.List;

public interface AddressService {
    List<AddressDTO> getAllAddresses();
}
