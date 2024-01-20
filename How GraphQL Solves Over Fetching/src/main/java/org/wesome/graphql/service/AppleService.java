package org.wesome.graphql.service;

import org.wesome.graphql.entity.Apple;

import java.util.Optional;

public interface AppleService {
    Optional<Apple> findApple();
}