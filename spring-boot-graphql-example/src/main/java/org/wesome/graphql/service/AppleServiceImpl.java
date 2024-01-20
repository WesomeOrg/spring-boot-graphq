package org.wesome.graphql.service;


import org.springframework.stereotype.Service;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.entity.AppleVO;

import java.util.ArrayList;
import java.util.List;

@Service
public record AppleServiceImpl() implements AppleService {

    private static final List<Apple> apples = new ArrayList<>(List.of(new Apple(1, "Macintosh", "sweet"), new Apple(2, "Fuji", "tangy"), new Apple(3, "Gala", "bitter"), new Apple(4, "Jonagold", "sour")));

    @Override
    public Apple findApple(int id) {
        return apples.get(id);
    }

    @Override
    public List<Apple> findAllApple() {
        return apples;
    }

    @Override
    public Apple addApple(AppleVO appleVO) {
        Apple apple = new Apple(apples.size(), appleVO.appleName(), appleVO.taste());
        apples.add(apple);
        return apple;
    }

    @Override
    public Apple updateApple(Apple apple) {
        return apples.set(apple.appleId(), apple);
    }
}