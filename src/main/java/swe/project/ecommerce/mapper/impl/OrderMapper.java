package swe.project.ecommerce.mapper;

import swe.project.ecommerce.dto.OrderDTO;
import swe.project.ecommerce.model.Order;

public class OrderMapper implements Mapper<Order, OrderDTO>{
    public OrderDTO mapToDTO(Order order){
        return new OrderDTO(
                order.getID(),
                order.getUser(),
                order.getPayment()
        );
    }

    public Order mapToEntity(OrderDTO orderDTO){
        return new Order(
                orderDTO.getID(),
                orderDTO.getUser(),
                orderDTO.getPayment()
        );
    }
}
