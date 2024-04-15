package swe.project.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.model.Address;
import swe.project.ecommerce.repository.AddressRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/e-commerce/addresses")
public class AddressController {
    private final AddressRepository addressRepository;


    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }


}
