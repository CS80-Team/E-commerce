package swe.project.ecommerce.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.OrderDTO;
import swe.project.ecommerce.service.OrderService;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private OrderService orderService;

    //add order
    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO){
        OrderDTO saved_order = orderService.createOrder(orderDTO);
        return new ResponseEntity<>(saved_order, HttpStatus.CREATED);
    }

//    @GetMapping("{id}")
//    public ResponseEntity<OrderDTO> getOrderById(@PathVariable("id") UUID orderID){
//        OrderDTO orderDTO = orderService.getOrderbyID(orderID);
//        return ResponseEntity.ok(orderDTO);
//    }

}
