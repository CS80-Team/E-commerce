package com.ecommerce.ecommerce.Services;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.Dto.SubCategoriesDto;
import com.ecommerce.ecommerce.Mappers.CategoriesMapper;
import com.ecommerce.ecommerce.Mappers.SubCategoriesMapper;
import com.ecommerce.ecommerce.Repositories.CategoriesRepository;
import com.ecommerce.ecommerce.Repositories.SubCategoriesRepository;
import com.ecommerce.ecommerce.models.Categories;
import com.ecommerce.ecommerce.models.SubCategories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SubCategoriesService {
    final private SubCategoriesRepository subCategoriesRepository ;
    final private SubCategoriesMapper subCategoriesMapper;

    public SubCategoriesService(SubCategoriesRepository subCategoriesRepository, SubCategoriesMapper subCategoriesMapper) {
        this.subCategoriesRepository = subCategoriesRepository;
        this.subCategoriesMapper = subCategoriesMapper;
    }


    public SubCategories saveSubCategories (
            SubCategoriesDto dto
    ){
        var SubCategories = SubCategoriesMapper.toSubCategories(dto);
        return  subCategoriesRepository.save(SubCategories);
    }
    public  void DeleteById(
            UUID id
    ){
        subCategoriesRepository.deleteById(id);
    }
    public void deleteByName (String name)
    {
        subCategoriesRepository.deleteSubCategoriesByNameLike(name);
    }

    public SubCategories findByName (String name)
    {
        return subCategoriesRepository.findSubCategoriesByNameLike(name);
    }
    public SubCategoriesDto findById (UUID id)
    {
        return  subCategoriesRepository.findById(id).map(SubCategoriesMapper::toSubCategoriesDto).orElse(null);
    }

    public List<SubCategoriesDto> findAll ()
    {
        return  subCategoriesRepository.findAll().stream().map(SubCategoriesMapper::toSubCategoriesDto).collect(Collectors.toList());
    }
}
