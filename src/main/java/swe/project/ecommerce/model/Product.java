package swe.project.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Entity
@Table(name = "product")
@Component
public class Product {
    @UuidGenerator
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;
    @Column(name = "name", nullable = false) //, length = 50)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "summary")
    private String summary;
}