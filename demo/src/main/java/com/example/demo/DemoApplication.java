package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.demo"}) 
@EntityScan(basePackages = {"com.example.demo.jpa"}) 
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Test1");
		SpringApplication.run(DemoApplication.class, args);
	}

}
