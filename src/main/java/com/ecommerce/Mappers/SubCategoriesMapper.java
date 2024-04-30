package com.ecommerce.ecommerce.Mappers;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.Dto.SubCategoriesDto;
import com.ecommerce.ecommerce.models.Categories;
import com.ecommerce.ecommerce.models.SubCategories;
import org.springframework.stereotype.Service;

@Service
public class SubCategoriesMapper {
    public static SubCategories toSubCategories(SubCategoriesDto dto)
    {
        SubCategories subCategories = new SubCategories();
        subCategories.setName((dto.name()));
        subCategories.setId((dto.id()));
        subCategories.setDescription((dto.description()));
        return  subCategories ;

    }
    public static SubCategoriesDto toSubCategoriesDto(SubCategories subcategories)
    {

        return  new SubCategoriesDto(
                subcategories.getId()
                ,subcategories.getName()
                ,subcategories.getDescription()
        );

    }
}
