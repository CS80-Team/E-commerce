package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false, unique = true, updatable = false)
    private UUID productId;

    @Column(name = "discount", nullable = false, updatable = false)
    private Double discount;

    @Column(name = "discount_start_date", nullable = false, updatable = false)
    private LocalDateTime discountStartDate;

    @Column(name = "discount_end_date", nullable = false, updatable = false)
    private LocalDateTime discountEndDate;
}
