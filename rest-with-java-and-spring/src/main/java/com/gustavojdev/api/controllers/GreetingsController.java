package com.gustavojdev.api.controllers;

import com.gustavojdev.api.model.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {

    private static final String template = "Hello, %s";

    private final AtomicLong counter = new AtomicLong();


    // http://localhost:8080/greeting?name=gustavo
    @RequestMapping("/greeting")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World!") String name){

        return new Greetings(counter.incrementAndGet(), String.format(template, name));


    }
}
