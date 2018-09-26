package com.cristik.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cristik
 */
@RestController
@RequestMapping("/say")
public class ProducerController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

}
