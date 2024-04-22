package com.ecommerce.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;


    @Column(unique = true,name="category_name",nullable = false)
    private String name ;

    @Column(name="category_des")
    private  String description ;
@JsonManagedReference
@OneToMany(mappedBy ="categories")
  private   List <SubCategories> subCategoriesList;

}
