package com.daebeen.coffee.order.domain;

import com.daebeen.coffee.menu.application.MenuDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderRequest {
    private MenuDto menu;
    private String customerId;
    private Long customerSeq;
}