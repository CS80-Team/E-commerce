package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private UUID ID;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false, updatable = false, unique = true)
    private Order orderID;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, updatable = false, unique = true)
    private Product productID;

}