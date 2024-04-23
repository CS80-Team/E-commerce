package com.ecommerce.ecommerce.Controllers;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.Services.CategoriesService;
import com.ecommerce.ecommerce.models.Categories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CategoriesController {

    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @PostMapping("/categories")
    public Categories saveCategories (
          @RequestBody CategoriesDto dto
){
  return  categoriesService.saveCategories(dto);
}

    @DeleteMapping("/categories/{category-id}")
    @ResponseStatus(HttpStatus.OK)
    public  void DeleteById(
            @PathVariable("category-id") UUID id
    ){
          categoriesService.DeleteById(id);
    }
    //>>>>>>>>>>DELETE BY NAME NOT WORK <<<<<<<<<<<<
    @DeleteMapping("/categories/delete-name/{category-name}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteByName (@PathVariable("category-name") String name)
    {
          categoriesService.deleteByName(name);
    }
    @GetMapping("/categories/search/{category-name}")
    public Categories findByName (@PathVariable("category-name") String name)
    {
        return  categoriesService.findByName(name);
    }
    @GetMapping("/categories/{category-id}")
    public CategoriesDto findById (@PathVariable("category-id") UUID id)
    {
        return  categoriesService.findById(id);
    }
    @GetMapping("/categories")
    public List<CategoriesDto> findAll ()
    {
        return  categoriesService.findAll();
    }
}
