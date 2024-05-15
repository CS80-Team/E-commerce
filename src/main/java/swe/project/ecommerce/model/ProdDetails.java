package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import swe.project.ecommerce.model.Product;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prod_details")
public class ProdDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false, unique = true, updatable = false)
    private Product product;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column(name = "updated_at")
    private LocalDateTime lastUpdateDate;

    @Column(name = "manufactured_at", nullable = false)
    private LocalDateTime manufactureDate;

    @Column(name = "color")
//    @Enumerated(EnumType.STRING)
    private String color;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "is_stock", nullable = false)
    private Boolean isStock;

    @Column(name = "price", nullable = false, precision = 5)
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;
}
