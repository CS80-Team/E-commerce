package swe.project.ecommerce.dto;


import java.util.UUID;

public record UserDTO (
        UUID id,
        String first_name,
        String last_name,
        String username,
        String email,
        boolean emailVerified
) {}
