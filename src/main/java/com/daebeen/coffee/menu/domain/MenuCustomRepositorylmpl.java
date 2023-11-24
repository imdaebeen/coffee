package com.daebeen.coffee.menu.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class MenuCustomRepositorylmpl implements MenuCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Menu> findPopularMenu() {
        return null;
    }
}
