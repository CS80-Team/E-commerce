package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@SuperBuilder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

    private String title;
    private String street;
    private String country;
    private String city;
    private String postalCode;
    private String phoneNumber;

    public Address() {}

    public Address(UUID id, String title, String street, String country, String city, String postalCode, String phoneNumber) {
        this.id = id;
        this.title = title;
        this.street = street;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }
}
