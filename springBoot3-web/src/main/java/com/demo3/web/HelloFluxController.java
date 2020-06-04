package com.demo3.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloFluxController {

    @GetMapping("/hello2")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world ~");
    }
}
