package com.ecommerce.ecommerce.Mappers;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.models.Categories;
import org.springframework.stereotype.Service;

@Service
public class CategoriesMapper {
    public Categories toCategories(CategoriesDto dto)
    {
        Categories categories = new Categories();
        categories.setName(dto.name());
        categories.setId(dto.id());
        categories.setDescription(dto.description());
        return  categories ;

    }
    public static CategoriesDto toCategoriesDto(Categories categories)
    {

        return  new CategoriesDto(
                categories.getId()
                ,categories.getName()
                ,categories.getDescription()
        );

    }

}
