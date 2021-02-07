package com.cristik.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cristik
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) {
		System.out.println();
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(EurekaApplication.class);
		springApplicationBuilder.run(args);
	}
}
