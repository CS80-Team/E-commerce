package swe.project.ecommerce.mapper;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.model.Address;

@Service
public class AddressMapper {
    public static AddressDTO mapToAddressDTO(Address address) {
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

    public static Address mapToAddress(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.id());
        address.setTitle(addressDTO.title());
        address.setCity(addressDTO.city());
        address.setCountry(addressDTO.country());
        address.setPhoneNumber(addressDTO.phoneNumber());
        address.setPostalCode(addressDTO.postalCode());
        address.setStreet(addressDTO.street());
        return address;
    }
}
