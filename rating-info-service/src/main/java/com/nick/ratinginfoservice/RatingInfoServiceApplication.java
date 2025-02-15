package com.nick.ratinginfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingInfoServiceApplication.class, args);
	}

}
