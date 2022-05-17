package com.masterdataservice.masterdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.masterdataservice")
@EntityScan("com.masterdataservice.masterdataservice.model.entity")
@EnableJpaRepositories(basePackages = "com.masterdataservice.masterdataservice.model.repo")
public class MasterdataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterdataServiceApplication.class, args);
	}

}
