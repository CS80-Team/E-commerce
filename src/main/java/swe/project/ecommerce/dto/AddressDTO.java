package swe.project.ecommerce.dto;

import java.util.UUID;

public record AddressDTO(
        UUID id,
        String title,
        String street,
        String country,
        String city,
        String postalCode,
        String phoneNumber
) {
}
