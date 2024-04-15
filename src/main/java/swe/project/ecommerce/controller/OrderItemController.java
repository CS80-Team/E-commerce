package swe.project.ecommerce.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/order_items")
public class OrderItemController {
    private OrderItemController orderItemController;
}
