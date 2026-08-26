package com.discoverbenix.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.discoverbenix.GamingConsole;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}

