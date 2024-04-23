package com.ecommerce.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sub_categories")
public class SubCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

    @Column(unique = true,name="category_name",nullable = false)
    private String name ;

    @Column(name="category_des",nullable = false)
    private  String description ;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="cat_id")
    private  Categories categories;
    @JsonManagedReference
    @OneToMany(mappedBy = "subCategories")
    private List <SubCategoriesProduct> subCategoriesProducts ;
}
