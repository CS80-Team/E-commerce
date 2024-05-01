package swe.project.ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;


@Entity
@Table
@Getter
@Setter
@SuperBuilder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

    @ManyToOne
    private User user;

    private String title;

    private String body;

    public Review(){}

    public Review(UUID id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
