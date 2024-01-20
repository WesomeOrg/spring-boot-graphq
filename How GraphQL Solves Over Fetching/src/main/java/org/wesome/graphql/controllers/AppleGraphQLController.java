package org.wesome.graphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.service.AppleService;

import java.util.Optional;

@Controller
public record AppleGraphQLController(@Autowired AppleService appleService) {
    @QueryMapping("findApple")
    Optional<Apple> findApple() {
        return appleService.findApple();
    }
}