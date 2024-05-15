package swe.project.ecommerce.service;

import swe.project.ecommerce.dto.OrderDTO;

import java.util.UUID;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);

    OrderDTO getOrderbyID(UUID orderID);
}
