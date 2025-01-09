package com.mlucov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class })
public class BookApplication {
    public static void main(String[] args) {
//        SpringLocaleHolder.init();
        SpringApplication.run(BookApplication.class, args);
    }
}