package com.ecommerce.ecommerce.Dto;

import java.util.UUID;

public record SubCategoriesDto(
        UUID id,
        String name,
        String description

) {
}
