package com.gf.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        System.out.println("你好呀");
        SpringApplication.run(GittestApplication.class, args);
    }

}
