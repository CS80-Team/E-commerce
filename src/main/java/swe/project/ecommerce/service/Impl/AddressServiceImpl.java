package swe.project.ecommerce.service.Impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.mapper.AddressMapper;
import swe.project.ecommerce.repository.AddressRepository;
import swe.project.ecommerce.service.AddressService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressDTO> getAllAddresses() {
        return addressRepository.findAll().stream().map(AddressMapper::mapToAddressDTO).collect(Collectors.toList());
    }

    @Override
    public List<AddressDTO> getAllAddressesByUserId(UUID id) {
        return addressRepository.getAddressesById(id);
    }
}
