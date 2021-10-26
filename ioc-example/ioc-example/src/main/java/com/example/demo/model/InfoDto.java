package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component

@ToString
public class InfoDto {
	
	private RestaurantInfo info;
	private Review review;
	
	public InfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 *  More than one Bean of the same type use @Qualifier and pass id
	 *  If no bean is found and not to throw exception set required=false @AutoWired(required=false)
	 */
	
	@Autowired(required=false)
	public InfoDto(@Qualifier("info")RestaurantInfo info, @Qualifier("foodReview") Review review) {
		
		super();
		this.info = info;
		this.review = review;
	}
	
	@Autowired(required=false)
	@Bean("info")
	public RestaurantInfo setInfo(RestaurantInfo info) {
		return info;
	}
	
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
}
