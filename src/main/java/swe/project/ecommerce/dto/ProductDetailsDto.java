package swe.project.ecommerce.dto;

import java.awt.*;
import java.time.LocalDateTime;

public record ProductDetailsDto(
        String brand,
        Boolean isStock,
        LocalDateTime manufactureDate,
        Color color,
        Double price,
        Integer quantity
) {
}
