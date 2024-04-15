package swe.project.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swe.project.ecommerce.model.Payment;
import swe.project.ecommerce.model.User;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private UUID id;
    private User user;
    private Payment payment;
}