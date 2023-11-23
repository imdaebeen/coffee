package main.java.com.daebeen.coffee.order.domain;


import main.java.com.daebeen.coffee.order.application.OrderDto;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String customerId;
    private Long menuId;
    private String menuName;
    private Long orderPrice;
    private LocalDateTime orderedAt;

    public Order(OrderRequest orderRequest){
        this.customerId = orderRequest.getCustomerId();
        this.menuId = orderRequest.getMenu().getMenuId();
        this.menuName = orderRequest.getMenu().getMenuName();
        this.orderPrice = orderRequest.getMenu().getMenuPrice();
        this.orderedAt = LocalDateTime.now();
    }
    public OrderDto toDto(){
        return new OrderDto(orderId, customerId, menuId, menuName, orderPrice, orderedAt);
    }
}