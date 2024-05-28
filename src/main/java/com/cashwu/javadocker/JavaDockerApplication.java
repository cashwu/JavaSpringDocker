package com.cashwu.javadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JavaDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDockerApplication.class, args);
    }
}
