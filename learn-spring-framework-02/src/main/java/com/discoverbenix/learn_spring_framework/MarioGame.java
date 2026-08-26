package com.discoverbenix.learn_spring_framework;

import com.discoverbenix.GamingConsole;

import org.springframework.stereotype.Component;

// @Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("jump Mario");
    }
    public void down() {
        System.out.println("down Mario");
    }
    public void left() {
        System.out.println("left Mario");
    }
    public void right() {
        System.out.println("right Mario");
    }

}