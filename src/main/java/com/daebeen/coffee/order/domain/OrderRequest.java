package main.java.com.daebeen.coffee.order.domain;

import main.java.com.daebeen.coffee.menu.application.MenuDto;

@Gette
@AllArgsConstructor
public class OrderRequest {
    private MenuDto menu;
    private String userId;
}