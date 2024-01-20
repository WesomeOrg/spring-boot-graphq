package org.wesome.graphql.service;

import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.entity.AppleVO;

import java.util.List;

public interface AppleService {
    Apple findApple(int id);

    List<Apple> findAllApple();

    Apple addApple(AppleVO appleVO);

    Apple updateApple(Apple apple);
}