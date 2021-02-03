package com.cristik.nacos.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhenghua.ni
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @NacosValue(value = "${aaa.bbb}", autoRefreshed = true)
    private String test;


    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "";
    }

}
