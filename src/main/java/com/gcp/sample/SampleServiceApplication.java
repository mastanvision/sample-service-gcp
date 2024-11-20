package com.gcp.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleServiceApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Sample Spring Boot Application Running on GCloud ........");
		SpringApplication.run(SampleServiceApplication.class, args);
	}

}
