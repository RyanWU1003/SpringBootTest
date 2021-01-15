package com.iii.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * *
 * @SpringBootApplication  標註一個主程式類別(有main(String[] args))的,說明這是一個Spring Boot應用
 */

@SpringBootApplication
public class FirstSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootTestApplication.class, args);
	}

}
