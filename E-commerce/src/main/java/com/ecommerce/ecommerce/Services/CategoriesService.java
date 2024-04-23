package com.ecommerce.ecommerce.Services;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.Mappers.CategoriesMapper;
import com.ecommerce.ecommerce.Repositories.CategoriesRepository;
import com.ecommerce.ecommerce.models.Categories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CategoiresService {
    final private CategoriesRepository categoriesRepository ;
    final private CategoriesMapper categoriesMapper;

    public CategoiresService (CategoriesRepository categoriesRepository, CategoriesMapper categoriesMapper) {
        this.categoriesRepository = categoriesRepository;
        this.categoriesMapper = categoriesMapper;
    }
    public Categories saveCategories (
             CategoriesDto dto
    ){
        var Categories = categoriesMapper.toCategories(dto);
        return  categoriesRepository.save(Categories);
    }
    public  void DeleteById(
            UUID id
    ){
        categoriesRepository.deleteById(id);
    }
    public void deleteByName (String name)
    {
        categoriesRepository.deleteCategoriesByNameLike(name);
    }

    public Categories findByName (String name)
    {
        return  categoriesRepository.findCategoriesByNameLike(name);
    }
    public CategoriesDto findById (UUID id)
    {
        return  categoriesRepository.findById(id).map(CategoriesMapper::toCategoriesDto).orElse(null);
    }

    public List<CategoriesDto> findAll ()
    {
        return  categoriesRepository.findAll().stream().map(CategoriesMapper::toCategoriesDto).collect(Collectors.toList());
    }
}
