package com.daebeen.coffee.menu.application;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuDto{
    private Long menuId;
    private String menuName;
    private Long menuPrice;
}