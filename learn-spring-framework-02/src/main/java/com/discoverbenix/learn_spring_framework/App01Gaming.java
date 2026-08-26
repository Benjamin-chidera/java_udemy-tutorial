package com.discoverbenix.learn_spring_framework;

public class App01Gaming {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContract();
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
        
    }
}
