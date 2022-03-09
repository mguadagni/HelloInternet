package com.careerdevs.HelloInternet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class NasaController {

    @Autowired
    private Environment env;

    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=";

    @GetMapping("/apod")
    public Object apodHandler(RestTemplate restTemplate) {
        String apiKey = env.getProperty("NASA_API_KEY");
        return restTemplate.getForObject(nasaApodEndpoint + apiKey, Object.class);
    }

    @GetMapping("port")
    public String portTest() {
        return env.getProperty("server.port");
    }

    @PostMapping("/info")
    public String apodInfo() {
        return "NASA APOD is a daily astro photography photo.";
    }

}



