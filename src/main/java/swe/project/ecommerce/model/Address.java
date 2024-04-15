package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Address {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String street;
    private String country;
    private String city;
    private String postalCode;
    private String phoneNumber;
}
