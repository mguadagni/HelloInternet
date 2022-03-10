package com.careerdevs.HelloInternet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloInternetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloInternetApplication.class, args);
	}

}
