package com.ecommerce.ecommerce.Repositories;

import com.ecommerce.ecommerce.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, UUID> {

    Categories findCategoriesByNameLike(String name);
    Categories deleteCategoriesByNameLike(String name);

}
