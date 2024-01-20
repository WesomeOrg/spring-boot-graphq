package org.wesome.graphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.*;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.entity.AppleVO;
import org.wesome.graphql.service.AppleService;

import java.util.List;

@RestController
public record AppleRestController(@Autowired AppleService appleService) {

    @GetMapping(path = "/findApple/{appleId}", produces = "application/json")
    Apple findApple(@PathVariable("appleId") int appleId) {
        return appleService.findApple(appleId);
    }

    @GetMapping(path = "/findAllApple", produces = "application/json")
    List<Apple> findAllApple() {
        return appleService.findAllApple();
    }


    @PutMapping(path = "/addApple", produces = "application/json")
    Apple addApple(@RequestBody AppleVO appleVO) {
        return appleService.addApple(appleVO);
    }

    @PostMapping(path = "/updateApple", produces = "application/json")
    Apple updateApple(@Argument Apple apple) {
        return appleService.updateApple(apple);
    }
}