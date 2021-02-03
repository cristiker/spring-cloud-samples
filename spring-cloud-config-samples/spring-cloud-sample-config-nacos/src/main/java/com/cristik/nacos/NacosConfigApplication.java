package com.cristik.nacos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhenghua.ni
 */
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(NacosConfigApplication.class);
        builder.run(args);
    }

}
