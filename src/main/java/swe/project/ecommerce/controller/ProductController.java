package swe.project.ecommerce.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.ProductDto;
import swe.project.ecommerce.service.impl.ProductService;

import java.util.UUID;

@Controller
@RestController
@RequestMapping("/api/v1/product")
public final class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable UUID productId, @RequestBody ProductDto productDto) {
        return productService.updateEntity(productId, productDto);
    }

    @PostMapping("/{productId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto productDto) {
        productService.create(productDto);
    }

    @DeleteMapping("/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable UUID productId) {
        productService.deleteEntity(productId);
    }

    @GetMapping("/{productId}")
    public ProductDto getProductById(@PathVariable UUID productId) {
        return productService.getProductById(productId);
    }

    @GetMapping
    public Page<ProductDto> getAllProducts(@RequestParam(defaultValue = "0") Integer pageNo,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @RequestParam(defaultValue = "ASC") Sort.Direction sortDir,
                                           @RequestParam(defaultValue = "id") String sortBy
    ) {
        return productService.getAllEntityPages(pageNo, pageSize, sortDir, sortBy);
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 100; i++) {
            ProductDto productDto = new ProductDto(
                    "Product " + i,
                    "Description: " + i,
                    "Summary: " + i
            );

            productService.create(productDto);
        }
    }
}
