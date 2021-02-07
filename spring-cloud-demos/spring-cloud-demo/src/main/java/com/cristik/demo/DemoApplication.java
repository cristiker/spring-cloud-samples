package com.cristik.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhenghua.ni
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static class User {
        private String aa;
        private String bb;

        public User() {
        }

        public User(String aa, String bb) {
            this.aa = aa;
            this.bb = bb;
        }
    }


}
