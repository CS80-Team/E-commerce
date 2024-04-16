package swe.project.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.model.Address;
import swe.project.ecommerce.service.AddressService;

import java.util.List;

@RestController
@RequestMapping(path = "/e-commerce/addresses")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }


}
