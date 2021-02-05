package com.cristik.nacos.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhenghua.ni
 */
@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${test:{}}")
    private User user;


    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public User test() {
        JSON.parseObject("{}", User.class);
        return user;
    }

    public static class User {
        private String name;
        private Integer age;
    }


}
