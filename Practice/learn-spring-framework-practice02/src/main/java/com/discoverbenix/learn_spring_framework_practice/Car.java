package com.discoverbenix.learn_spring_framework_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component
class Enginee {
    public void start() {
        System.out.println("Engine started");
    }

    @PostConstruct
    public void checkEngine() {
        System.out.println("Engine is ready");
    }
}

@Component
class Gear {
    public void shift() {
        System.out.println("Drive gear engaged");
    }
}

@Component
@Scope("prototype")
class Radio {
    public void play() {
        System.out.println("Playing music");
    }
}

@Component
public class Car {
    private final Enginee enginee;
    private final Enginee enginee2;
    private final Gear gear;
    private final Radio radio;
    private final Radio radio2;

    @Autowired
    public Car(Enginee enginee, Enginee enginee2, Gear gear, Radio radio, Radio radio2) {
        System.out.println("Car constructor");
        this.enginee = enginee;
        this.enginee2 = enginee2;
        this.gear = gear;
        this.radio = radio;
        this.radio2 = radio2;
    }

    public void proveScopes() {
        System.out.println("Engine 1: " + System.identityHashCode(enginee));
        System.out.println("Engine 2: " + System.identityHashCode(enginee2));
        // Expect: SAME number, because Enginee is singleton

        System.out.println("Radio 1: " + System.identityHashCode(radio));
        System.out.println("Radio 2: " + System.identityHashCode(radio2));
        // Expect: DIFFERENT numbers, because Radio is prototype
    }

    public void drive() {
        enginee.start();
        // enginee.checkEngine();
        System.out.println("Car is ready");
    }

    public void shiftGear() {
        gear.shift();
    }

    public void listenToMusic() {
        radio.play();
    }
    
}
