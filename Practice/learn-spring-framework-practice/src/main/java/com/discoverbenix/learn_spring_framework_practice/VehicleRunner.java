package com.discoverbenix.learn_spring_framework_practice;

public class VehicleRunner {
    private VehicleConsole vehicle;

    public VehicleRunner(VehicleConsole vehicle){
        this.vehicle = vehicle;
    }

    public void run() {
        System.out.println("Running..." + vehicle);
        vehicle.getMake();
        vehicle.getModel();
        vehicle.getYear();       
    }
}
