package swe.project.ecommerce.service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.OrderDTO;
import swe.project.ecommerce.exception.ResourceNotFoundException;
import swe.project.ecommerce.mapper.impl.OrderMapper;
import swe.project.ecommerce.model.Order;
import swe.project.ecommerce.repository.OrderRepository;
import swe.project.ecommerce.service.OrderService;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private final OrderMapper orderMapper = new OrderMapper();

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderMapper.mapToEntity(orderDTO);
        Order saved_order = orderRepository.save(order);
        return orderMapper.mapToDTO(saved_order);
    }

    @Override
    public OrderDTO getOrderbyID(UUID orderID) {
        Order order = orderRepository.findById(orderID)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order not found with give ID: "+orderID));
        return orderMapper.mapToDTO(order);
    }
}
