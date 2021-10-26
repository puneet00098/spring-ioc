package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.InfoDto;
import com.example.demo.model.RestaurantInfo;
import com.example.demo.model.Review;

@Configuration
public class ApplicationConfig {

	//Factory Method
	
	@Bean
	public Review foodReview() {
		
		return new Review(101,"sangeetha","vicky","food","excellent taste",4.2);
	}
	
	
}
