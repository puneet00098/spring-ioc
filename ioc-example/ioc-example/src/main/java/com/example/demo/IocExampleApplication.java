package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Review;



@SpringBootApplication
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class IocExampleApplication {

	public static void main(String[] args) {

		// Capturing the Reference to the Ioc Container here => represented by ctx

		ConfigurableApplicationContext ctx =
				SpringApplication.run(IocExampleApplication.class, args);
		
		System.out.println(ctx.getClass().getName());
		
		Review objRef = ctx.getBean("reviewBean",Review.class);
		
		System.out.println(objRef);

	}

}
