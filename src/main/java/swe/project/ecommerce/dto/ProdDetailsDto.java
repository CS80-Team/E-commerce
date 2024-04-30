package swe.project.ecommerce.dto;

import swe.project.ecommerce.model.Product;

import java.time.LocalDateTime;

public record ProdDetailsDto(
        Product product,
        LocalDateTime creationDate,
        LocalDateTime lastUpdateDate,
        LocalDateTime manufactureDate,
        String color,
        String brand,
        Boolean isStock,
        Double price
) {
}
