package swe.project.ecommerce.dto;


public record ProductDto (
        String name,
        String description,
        Double price,
        Integer quantity
) {}
