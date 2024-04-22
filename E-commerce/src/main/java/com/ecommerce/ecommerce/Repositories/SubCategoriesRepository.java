package com.ecommerce.ecommerce.Repositories;

import com.ecommerce.ecommerce.models.SubCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoriesRepository extends JpaRepository<SubCategories,Integer> {
}
