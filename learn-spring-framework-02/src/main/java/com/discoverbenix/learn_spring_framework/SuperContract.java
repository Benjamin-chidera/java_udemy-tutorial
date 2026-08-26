package com.discoverbenix.learn_spring_framework;

import com.discoverbenix.GamingConsole;

import org.springframework.stereotype.Component;

@Component
public class SuperContract implements GamingConsole {

    public void up() {
        System.out.println("Super jump");
    }
    public void down() {
        System.out.println("Super down");
    }
    public void left() {
        System.out.println("Super left");
    }
    public void right() {
        System.out.println("Super right");
    }

}