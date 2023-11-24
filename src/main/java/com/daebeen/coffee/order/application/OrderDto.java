package com.daebeen.coffee.order.application;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

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