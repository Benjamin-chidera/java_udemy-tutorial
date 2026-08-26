package com.discoverbenix.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, String emailAddress) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Benix";
    }

    @Bean
    public int age() {
        return 28;
    }

    @Bean
    public String EmailAddress() {
        return "[EMAIL_ADDRESS]";
    }

    @Bean
    public Person person() {
        return new Person(name(), age(), EmailAddress());
    }
}
