package swe.project.ecommerce.controller;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.ProdDetailsDto;
import swe.project.ecommerce.model.ProdDetails;
import swe.project.ecommerce.model.Product;
import swe.project.ecommerce.service.Impl.ProdDetailsService;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/prodDetails")
public class ProdDetailsController {

    @Autowired
    private final ProdDetailsService prodDetailsService;

    @GetMapping("/{productId}")
    public List<ProdDetails> getProdDetailsByProductId(@PathVariable UUID productId) {
        return prodDetailsService.getProdDetailsByProductId(productId);
    }

    @DeleteMapping("/{prodDetailsId}")
    public void deleteProdDetails(@PathVariable UUID prodDetailsId) {
        prodDetailsService.deleteProdDetails(prodDetailsId);
    }

    @PutMapping("/{prodDetailsId}")
    public void updateProdDetails(@PathVariable UUID prodDetailsId, @RequestBody ProdDetailsDto prodDetailsDto) {
        prodDetailsService.updateProdDetails(prodDetailsId, prodDetailsDto);
    }

    @PostMapping("/{productId}")
    public void addNewProdDetails(@RequestBody ProdDetailsDto prodDetailsDto) {
        prodDetailsService.addNewProdDetails(prodDetailsDto);
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 100; i++) {
            ProdDetailsDto prodDetails = new ProdDetailsDto(
                    new Product(
                            UUID.randomUUID(),
                            new HashSet<>(),
                            "Product " + i,
                            "Description: " + i,
                            "Summary: " + i
                    ),
                    LocalDateTime.now(),
                    LocalDateTime.now(),
                    LocalDateTime.now(),
                    "RED",
                    "HP",
                    Boolean.TRUE,
                    99.99
            );

            prodDetailsService.addNewProdDetails(prodDetails);
        }
    }
}
