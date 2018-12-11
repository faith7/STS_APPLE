package com.yoon.Lecture3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstWebAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstWebAppApplication.class, args);
		
	}
}
