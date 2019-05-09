package com.github.chengzhx76.reactor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @desc:
 * @author: hp
 * @date: 2019/5/9
 */
@RestController
public class IndexController {

    @GetMapping("test")
    public Mono<String> test() {
        return Mono.just("hello word ~~~");
    }

}
