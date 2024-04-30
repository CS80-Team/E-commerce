package com.ecommerce.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class SubCategoriesProduct {
    @JsonBackReference
    @ManyToOne
    @Id
    @JoinColumn(name = "subcategory_id")
    private SubCategories subCategories ;
}
