package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo.*")
@ComponentScan("com.example.demo.Quiz")
@SpringBootApplication
public class LmsQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsQuizApplication.class, args);
	}

}
