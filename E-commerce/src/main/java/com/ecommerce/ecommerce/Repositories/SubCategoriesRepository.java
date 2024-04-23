package com.ecommerce.ecommerce.Repositories;

import com.ecommerce.ecommerce.models.Categories;
import com.ecommerce.ecommerce.models.SubCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubCategoriesRepository extends JpaRepository<SubCategories, UUID> {
    SubCategories findSubCategoriesByNameLike(String name);
    SubCategories deleteSubCategoriesByNameLike(String name);
}
