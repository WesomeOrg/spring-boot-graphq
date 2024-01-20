package org.wesome.graphql.service;

import org.springframework.stereotype.Service;
import org.wesome.graphql.entity.Apple;

import java.util.Optional;

import static org.wesome.graphql.GraphqlProjectApplication.apple;

@Service
public record AppleServiceImpl() implements AppleService {
    @Override
    public Optional<Apple> findApple() {
        return Optional.of(apple);
    }
}