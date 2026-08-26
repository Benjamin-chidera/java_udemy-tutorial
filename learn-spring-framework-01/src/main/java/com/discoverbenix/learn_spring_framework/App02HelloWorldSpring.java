package com.discoverbenix.learn_spring_framework;

// ./mvnw compile exec:java


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class)) {

            System.out.println("Name is: " + context.getBean("name"));
            System.out.println("Age is: " + context.getBean("age"));
            System.out.println("Email Address is: " + context.getBean("EmailAddress"));
            System.out.println(context.getBean("person"));
        }
    }
}
