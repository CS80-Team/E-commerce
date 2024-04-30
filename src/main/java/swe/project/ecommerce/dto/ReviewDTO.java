package swe.project.ecommerce.dto;


import swe.project.ecommerce.model.User;

import java.util.UUID;

public record ReviewDTO(
        UUID id,
        String title,
        String body
) {
}
