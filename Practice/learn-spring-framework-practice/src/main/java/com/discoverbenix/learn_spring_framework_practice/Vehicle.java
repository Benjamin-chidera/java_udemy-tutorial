package com.discoverbenix.learn_spring_framework_practice;

public class Vehicle {
    public static void main(String[] args) {
            // var vehicle = new Car("Toyota", "Corolla", 2026);
            // var vehicle = new Bicycle("Bajaj", "Pulsar", 2020);
            var vehicle = new Plane("Boeing", "747", 2020);
            var vehicleRunner = new VehicleRunner(vehicle);
            vehicleRunner.run();
        }    
}
