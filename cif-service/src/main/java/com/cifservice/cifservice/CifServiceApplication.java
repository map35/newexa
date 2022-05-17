package com.cifservice.cifservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CifServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CifServiceApplication.class, args);
	}

	@Bean
	// @LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
