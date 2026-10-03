package com.discoverbenix.learn_spring_framework_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringFrameworkPracticeApplication.class, args);

		Car car = context.getBean(Car.class);
		car.drive();
		car.shiftGear();
		car.listenToMusic();
		car.proveScopes();
		
	}

}