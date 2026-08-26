package com.discoverbenix.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.discoverbenix.GamingConsole;

@Configuration
@ComponentScan("com.discoverbenix.learn_spring_framework")
public class App03Gaming {

    // @Bean
    // public GameRunner gameRunner(GamingConsole game) {
    // System.out.println("Game: " + game.getClass());
    // return new GameRunner(game);
    // }

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(
                App03Gaming.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).down();
            context.getBean(GamingConsole.class).left();
            context.getBean(GamingConsole.class).right();

        }

    }
}
