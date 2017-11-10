package com.shebao.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@RequestMapping("/springboot")
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }
}