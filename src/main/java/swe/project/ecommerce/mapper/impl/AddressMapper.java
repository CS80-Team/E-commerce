package swe.project.ecommerce.mapper.impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.mapper.Mapper;
import swe.project.ecommerce.model.Address;

@Service
public class AddressMapper implements Mapper<Address, AddressDTO> {
    @Override
    public Address mapToEntity(AddressDTO entityDTO) {
        return new Address(
                entityDTO.id(),
                entityDTO.title(),
                entityDTO.street(),
                entityDTO.country(),
                entityDTO.city(),
                entityDTO.postalCode(),
                entityDTO.phoneNumber()
        );
    }

    @Override
    public AddressDTO mapToDTO(Address address) {
        return new AddressDTO(
                address.getId(),
                address.getTitle(),
                address.getCity(),
                address.getCountry(),
                address.getPhoneNumber(),
                address.getPostalCode(),
                address.getStreet()
        );
    }
}
