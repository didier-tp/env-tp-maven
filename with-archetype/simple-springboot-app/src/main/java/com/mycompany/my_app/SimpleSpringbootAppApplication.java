package com.mycompany.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAppApplication.class, args);
		System.out.println("http://localhost:8181/simple-springboot-app (dev mode)");
	}

}
