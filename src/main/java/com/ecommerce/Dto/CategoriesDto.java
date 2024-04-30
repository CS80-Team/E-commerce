package com.ecommerce.ecommerce.Dto;

import java.util.UUID;

public record CategoriesDto(
        UUID id,
        String name,
        String description
) {

}
