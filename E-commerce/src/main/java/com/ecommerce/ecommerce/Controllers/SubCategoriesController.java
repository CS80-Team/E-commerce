package com.ecommerce.ecommerce.Controllers;

import com.ecommerce.ecommerce.Dto.SubCategoriesDto;
import com.ecommerce.ecommerce.Services.SubCategoriesService;
import com.ecommerce.ecommerce.models.SubCategories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RestController
public class SubCategoriesController {

    private final SubCategoriesService subCategoriesService;

    public SubCategoriesController(SubCategoriesService subCategoriesService) {
        this.subCategoriesService = subCategoriesService;
    }


    @PostMapping("/subcategories")
    public SubCategories saveSubCategories (
            @RequestBody SubCategoriesDto dto
    ){
        return  subCategoriesService.saveSubCategories(dto);
    }

    @DeleteMapping("/subcategories/{subcategory-id}")
    @ResponseStatus(HttpStatus.OK)
    public  void DeleteById(
            @PathVariable("subcategory-id") UUID id
    ){
        subCategoriesService.DeleteById(id);
    }
    //>>>>>>>>>>DELETE BY NAME NOT WORK <<<<<<<<<<<<
    @DeleteMapping("/subcategories/delete-name/{subcategory-name}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteByName (@PathVariable("subcategory-name") String name)
    {
        subCategoriesService.deleteByName(name);
    }
    @GetMapping("/subcategories/search/{subcategory-name}")
    public SubCategories findByName (@PathVariable("subcategory-name") String name)
    {
        return  subCategoriesService.findByName(name);
    }
    @GetMapping("/subcategories/{subcategory-id}")
    public SubCategoriesDto findById (@PathVariable("subcategory-id") UUID id)
    {
        return  subCategoriesService.findById(id);
    }
    @GetMapping("/subcategories")
    public List<SubCategoriesDto> findAll ()
    {
        return  subCategoriesService.findAll();
    }
}
