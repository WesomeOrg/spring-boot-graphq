package org.wesome.graphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.service.AppleService;

import java.util.Optional;

@RestController
public record AppleRestController(@Autowired AppleService appleService) {
    @GetMapping(path = "/findApple", produces = "application/json")
    Optional<Apple> findApple() {
        return appleService.findApple();
    }
}