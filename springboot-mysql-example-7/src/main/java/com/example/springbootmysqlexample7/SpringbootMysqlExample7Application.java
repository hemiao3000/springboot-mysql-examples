package com.example.springbootmysqlexample7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.springbootmysqlexample7.dao")
@SpringBootApplication
public class SpringbootMysqlExample7Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlExample7Application.class, args);
    }

}
