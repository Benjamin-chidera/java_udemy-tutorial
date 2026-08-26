package com.discoverbenix.learn_spring_framework;

import com.discoverbenix.GamingConsole;

import org.springframework.stereotype.Component;

// @Component
public class PacMan implements GamingConsole {

    public void up() {
        System.out.println("PacMan jump");
    }
    public void down() {
        System.out.println("PacMan down");
    }
    public void left() {
        System.out.println("PacMan left");
    }
    public void right() {
        System.out.println("PacMan right");
    }

}