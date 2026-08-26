package com.discoverbenix.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.discoverbenix.GamingConsole;

public class App02Gaming {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContract();
        // var game = new PacMan();
        // var gameRunner = new GameRunner(game);
        // gameRunner.run();

        try (var context = new AnnotationConfigApplicationContext(
                GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).down();
            context.getBean(GamingConsole.class).left();
            context.getBean(GamingConsole.class).right();

        }

    }
}
