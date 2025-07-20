package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Demo01BeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01BeanApplication.class, args);
    }

}
