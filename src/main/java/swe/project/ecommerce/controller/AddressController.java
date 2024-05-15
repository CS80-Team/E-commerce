package swe.project.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.service.impl.AddressServiceImpl;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/e-commerce/addresses")
public class AddressController {
    private final AddressServiceImpl addressService;

    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<AddressDTO> getAllAddresses() {
        return addressService.getAllEntities();
    }

    @GetMapping("/{id}")
    public List<AddressDTO> getAllAddressesByUserId(@PathVariable UUID id) {
        return addressService.getAllEntitiesById(id);
    }
}
