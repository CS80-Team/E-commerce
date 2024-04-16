package swe.project.ecommerce.service.Impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.model.Address;
import swe.project.ecommerce.repository.AddressRepository;
import swe.project.ecommerce.service.AddressService;

import java.util.List;

@Service
public class AddressServiceImp implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImp(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}
