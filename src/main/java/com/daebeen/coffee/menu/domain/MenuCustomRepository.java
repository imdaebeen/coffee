package com.daebeen.coffee.menu.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuCustomRepository {
    List<Menu> findPopularMenu();
}
