package com.mycompany.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiModuleSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiModuleSpringbootAppApplication.class, args);
		System.out.println("http://localhost:8181/multimodule-springboot-app (dev mode)");
	}

}
