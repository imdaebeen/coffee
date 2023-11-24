package com.daebeen.coffee.menu.domain;

import com.daebeen.coffee.menu.application.MenuDto;

public class Menu {

    private Long menuId;
    private String menuName;
    private Long menuPrice;

    public Menu(String menuName, Long menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }


    public MenuDto toDto() {
        return new MenuDto(menuId,menuName,menuPrice);
    }
}