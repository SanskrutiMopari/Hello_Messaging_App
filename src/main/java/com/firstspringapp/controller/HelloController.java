package com.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz!!!";
    }

    @GetMapping("/query")
    public String sayHelloParam(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
