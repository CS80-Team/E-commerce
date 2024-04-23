package swe.project.ecommerce.dto;


import java.util.UUID;

public record ReviewDTO (
        UUID id,
        String title,
        String body
){
}
