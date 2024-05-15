package swe.project.ecommerce.mapper;

import swe.project.ecommerce.dto.OrderDTO;
import swe.project.ecommerce.model.Order;

public class OrderMapper {
    public static OrderDTO maptoOrderDTO(Order order){
        return new OrderDTO(
                order.getID(),
                order.getUser(),
                order.getPayment()
        );
    }

    public static Order maptoOrder(OrderDTO orderDTO){
        return new Order(
                orderDTO.getID(),
                orderDTO.getUser(),
                orderDTO.getPayment()
        );
    }
}
