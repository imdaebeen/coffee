package main.java.com.daebeen.coffee.order.application;

import main.java.com.daebeen.coffee.menu.application.MenuDto;
import main.java.com.daebeen.coffee.menu.application.MenuService;
import main.java.com.daebeen.coffee.order.domain.Order;
import main.java.com.daebeen.coffee.order.domain.OrderRepository;
import main.java.com.daebeen.coffee.order.domain.OrderRequest;
import main.java.com.daebeen.coffee.point.application.PointService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
//import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService{

    OrderRepository orderRepository;

    MenuService menuService;

    PointService pointService;

//    ApplicationEventPublisher applicationEventPublisher;

    public OrderDto createOrder(OrderRequest request){
        final MenuDto menu = menuService.getMenu(request.getMenuId());
        final Order order = new Order(new OrderRequest(menu, request.getCustomerId()));
        pointService.pointPayment(request.getCustomerId(), order.getOrderPrice());
        final OrderDto orderDto = orderRepository.save(order).toDto();

        return orderDto;
    }

}