package org.wesome.graphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.entity.AppleVO;
import org.wesome.graphql.service.AppleService;

import java.util.List;

@Controller
public record AppleGraphQLController(@Autowired AppleService appleService) {
    @QueryMapping("findApple")
    Apple findApple(@Argument int appleId) {
        return appleService.findApple(appleId);
    }

    @QueryMapping("findAllApple")
    List<Apple> findAllApple() {
        return appleService.findAllApple();
    }

    @MutationMapping("addApple")
    Apple addApple(@Argument AppleVO appleVO) {
        return appleService.addApple(appleVO);
    }

    @MutationMapping("updateApple")
    Apple updateApple(@Argument Apple apple) {
        return appleService.updateApple(apple);
    }
}