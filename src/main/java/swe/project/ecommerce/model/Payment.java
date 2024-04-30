package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "payment_id", nullable = false, updatable = false, unique = true)
    private UUID ID;

    @OneToMany
    private List<Order> orders;

    private Set<PaymentMethod> paymentMethods;

    public void addOrder(final Order order){
        if(orders == null){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }

    public void addOrders(final List<Order> orders){
        if(this.orders == null){
            this.orders = new ArrayList<>();
        }
        this.orders.addAll(orders);
    }
}