package com.careerdevs.HelloInternet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloInternetApplication {

	@GetMapping ("/")
	private String rootRoute() {
		return "You requested the root route";
	}

	@GetMapping ("/random")
	private int randomNumber() {
		return (int)(Math.random() * 100);
	}

	String joke1 = "What’s the best thing about Switzerland?\r\nI don’t know, but the flag is a big plus.";
	String joke2 = "Did you hear about the mathematician who’s afraid of negative numbers?\r\nHe’ll stop at nothing to avoid them.";
	String joke3 = "Why do we tell actors to \"break a leg?\"\r\nBecause every play has a cast.";
	String joke4 = "Hear about the new restaurant called Karma?\r\nThere’s no menu: You get what you deserve.";
	String[] jokeArray = {joke1, joke2, joke3, joke4};
	@GetMapping ("/joke")
	private String randomJoke() {
		return jokeArray[(int)(Math.random()*4)];
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloInternetApplication.class, args);
	}

}
