package swe.project.ecommerce.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.model.Discount;
import swe.project.ecommerce.service.Impl.DiscountService;

import java.util.UUID;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/discounts")
public class DiscountController {
    @Autowired
    private final DiscountService discountService;

    @GetMapping("/{discountId}")
    public Discount getDiscountById(@PathVariable UUID discountId) {
        return discountService.getEntityById(discountId);
    }

    @GetMapping("{productId}")
    public Discount getDiscountByProductId(@PathVariable UUID productId) {
        return discountService.getDiscountByProductId(productId);
    }

    @PostMapping
    public void createDiscount(@RequestBody Discount discount) {
        discountService.create(discount);
    }

    @PutMapping("/{discountId}")
    public void updateDiscount(@PathVariable UUID discountId, @RequestBody Discount discount) {
        discountService.updateEntity(discountId, discount);
    }

    @DeleteMapping("/{discountId}")
    public void deleteDiscount(@PathVariable UUID discountId) {
        discountService.deleteEntity(discountId);
    }
}
