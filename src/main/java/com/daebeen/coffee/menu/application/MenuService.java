package main.java.com.daebeen.coffee.menu.application;

import lombok.RequiredArgsConstructor;
import main.java.com.daebeen.coffee.common.CoffeeBadRequestException;
import main.java.com.daebeen.coffee.common.CoffeeError;
import main.java.com.daebeen.coffee.menu.domain.Menu;
import main.java.com.daebeen.coffee.menu.domain.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService{
    private final MenuRepository menuRepository;

    public List<MenuDto> getAllMenu() {
        return menuRepository.findAll().map(Menu::toDto).collect(Collectors.toList());
    }

    public MenuDto getMenu(Long menuId) {
        Optional<Menu> byId = menuRepository.findById(menuId);
        return byId.orElseThrow(() -> new CoffeeBadRequestException(CoffeeError.MENU_NOT_FOUND)).toDto();
    }


    public List<MenuDto> getPopularMenu() {
        return menuRepository.findPopularMenu().map(Menu::toDto).collect(Collectors.toList());
    }
}