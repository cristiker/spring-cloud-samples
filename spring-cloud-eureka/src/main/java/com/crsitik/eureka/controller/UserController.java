package com.crsitik.eureka.controller;

import com.crsitik.eureka.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cristik
 * @version 1.0
 * @date 2021/2/4 22:01
 * @since 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${user.info:{'name':'cristik','age':21}}")
    private User user;

    @GetMapping("/info")
    public User userInfo() {
        return user;
    }

}
