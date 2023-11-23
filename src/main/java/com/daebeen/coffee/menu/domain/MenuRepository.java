package main.java.com.daebeen.coffee.menu.domain;

import main.java.com.daebeen.coffee.menu.application.MenuDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findPopularMenu();
}