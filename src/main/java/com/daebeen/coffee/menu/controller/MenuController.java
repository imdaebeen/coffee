package com.daebeen.coffee.menu.controller;

import com.daebeen.coffee.menu.application.MenuDto;
import com.daebeen.coffee.menu.application.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class MenuController{
    private final MenuService menuService;

    @GetMapping("/")
    public List<MenuDto> getAllMenu(){
        return menuService.getAllMenu();
    }

    @GetMapping("/popular")
    public List<MenuDto> getPopularMenu(){
        return menuService.getPopularMenu();
    }
}