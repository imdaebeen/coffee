package main.java.com.daebeen.coffee.order.application;

import java.time.LocalDateTime;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class OrderDto {
    Long orderId;
    String customerId;
    Long menuId;
    String menuName;
    Long orderPrice;
    LocalDateTime orderedAt;
}