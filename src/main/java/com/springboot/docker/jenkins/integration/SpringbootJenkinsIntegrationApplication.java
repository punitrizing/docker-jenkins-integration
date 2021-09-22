package com.springboot.docker.jenkins.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsIntegrationApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return("Sample code for JAVA Springboot REST based API !");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsIntegrationApplication.class, args);
	}

}
