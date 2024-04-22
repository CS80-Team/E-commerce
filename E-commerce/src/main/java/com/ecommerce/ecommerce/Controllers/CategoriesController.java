package com.ecommerce.ecommerce.Controllers;

import com.ecommerce.ecommerce.Dto.CategoriesDto;
import com.ecommerce.ecommerce.Services.CategoiresService;
import com.ecommerce.ecommerce.models.Categories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CategoriesController {

    private CategoiresService categoiresService ;

    @PostMapping("/categories")
    public Categories saveCategories (
          @RequestBody CategoriesDto dto
){
  return  categoiresService.saveCategories(dto);
}

    @DeleteMapping("/categories/{category-id}")
    @ResponseStatus(HttpStatus.OK)
    public  void DeleteById(
            @PathVariable("category-id") UUID id
    ){
          categoiresService.DeleteById(id);
    }
    //>>>>>>>>>>DELETE BY NAME NOT WORK <<<<<<<<<<<<
    @DeleteMapping("/categories/delete-name/{category-name}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteByName (@PathVariable("category-name") String name)
    {
          categoiresService.deleteByName(name);
    }
    @GetMapping("/categories/search/{category-name}")
    public Categories findByName (@PathVariable("category-name") String name)
    {
        return  categoiresService.findByName(name);
    }
    @GetMapping("/categories/{category-id}")
    public CategoriesDto findById (@PathVariable("category-id") UUID id)
    {
        return  categoiresService.findById(id);
    }
    @GetMapping("/categories")
    public List<CategoriesDto> findAll ()
    {
        return  categoiresService.findAll();
    }
}
