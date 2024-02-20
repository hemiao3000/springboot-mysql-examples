package com.example.springbootmysqlexample6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.springbootmysqlexample6.dao")
@SpringBootApplication
public class SpringbootMysqlExample6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlExample6Application.class, args);
    }

}
