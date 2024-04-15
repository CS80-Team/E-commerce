package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.awt.Color;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "product_details")
@Getter
@Setter
@Component
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

    @Column(name = "product_id", nullable = false, unique = true, updatable = false)
    private UUID productId;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column(name = "updated_at")
    private LocalDateTime lastUpdateDate;

    @Column(name = "manufactured_at", nullable = false)
    private LocalDateTime manufactureDate;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "is_stock", nullable = false)
    private Boolean isStock;

    @Column(name = "price", nullable = false, precision = 5)
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}
