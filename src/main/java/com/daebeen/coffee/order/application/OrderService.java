package com.daebeen.coffee.order.application;

import com.daebeen.coffee.menu.application.MenuDto;
import com.daebeen.coffee.menu.application.MenuService;
import com.daebeen.coffee.order.domain.Order;
import com.daebeen.coffee.order.domain.OrderRepository;
import com.daebeen.coffee.order.domain.OrderRequest;
import com.daebeen.coffee.point.application.PointService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService{

    OrderRepository orderRepository;

    MenuService menuService;

    PointService pointService;

    public OrderDto createOrder(OrderRequest request){
        final MenuDto menu = menuService.getMenu(request.getMenu().getMenuId());
        final Order order = new Order(new OrderRequest(menu, request.getCustomerId(), request.getCustomerSeq()));
        pointService.pointPayment(request.getCustomerSeq(), order.getOrderPrice());
        final OrderDto orderDto = orderRepository.save(order).toDto();

        return orderDto;
    }

}