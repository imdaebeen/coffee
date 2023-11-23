package main.java.com.daebeen.coffee.menu.controller;

import main.java.com.daebeen.coffee.menu.application.MenuDto;
import main.java.com.daebeen.coffee.menu.application.MenuService;

import java.util.List;

@Api(tage="menu")
@RestController
@RequestMapping("/api/menu")
public class MenuController{
    private final MenuService menuService;

    @ApiOperation(value= "커피 메뉴 목록 조회 API")
    @GetMapping("/")
    public List<MenuDto> getAllMenu(){
        return menuService.getAllMenu();
    }

    @ApiOperation(value = "인기메뉴 목록 조회")
    @GetMapping("/popular")
    public List<MenuDto> getPopularMenu(){
        return menuService.getPopularMenu();
    }
}