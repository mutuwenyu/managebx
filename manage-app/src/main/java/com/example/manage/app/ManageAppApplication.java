package com.example.manage.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.manage.app.mapper")
public class ManageAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageAppApplication.class, args);
    }

}
