package com.mycompany.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiModuleSpringbootAppApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.profiles.default","persistence-dev,persistence-reinit");
		SpringApplication.run(MultiModuleSpringbootAppApplication.class, args);
		System.out.println("http://localhost:8181/multimodule-springboot-app (dev mode)");
		//System.out.println("spring.profiles.default="+System.getProperty("spring.profiles.default"));
	}

}
