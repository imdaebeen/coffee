package com.daebeen.coffee.menu.application;

import com.daebeen.coffee.common.CoffeeBadRequestException;
import com.daebeen.coffee.common.CoffeeError;
import com.daebeen.coffee.menu.domain.Menu;
import com.daebeen.coffee.menu.domain.MenuCustomRepository;
import com.daebeen.coffee.menu.domain.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService{
    private final MenuRepository menuRepository;
    private final MenuCustomRepository menuCustomRepository;

    public List<MenuDto> getAllMenu() {
        return menuRepository.findAll().stream().map(Menu::toDto).collect(Collectors.toList());
    }

    public MenuDto getMenu(Long menuId) {
        Optional<Menu> byId = menuRepository.findById(menuId);
        return byId.orElseThrow(() -> new CoffeeBadRequestException(CoffeeError.MENU_NOT_FOUND)).toDto();
    }


    public List<MenuDto> getPopularMenu() {
        return menuCustomRepository.findPopularMenu().stream().map(Menu::toDto).collect(Collectors.toList());
    }
}