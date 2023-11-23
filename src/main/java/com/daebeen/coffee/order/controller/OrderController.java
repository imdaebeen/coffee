package main.java.com.daebeen.coffee.order.controller;

import main.java.com.daebeen.coffee.order.application.OrderDto;
import main.java.com.daebeen.coffee.order.application.OrderService;
import main.java.com.daebeen.coffee.order.domain.OrderRequest;

@Tag(name = "order", description ="커피 주문/결제하기 API")
@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController{

    OrderService orderService;

    @Operation(summary = "주문/결제")
    @PostMapping("/")
    public OrderDto createOrder(@RequestBody @Valid OrderRequest orderRequest){
        return orderService.createOrder(orderRequest);
    }
}