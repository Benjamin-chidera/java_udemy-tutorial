package com.discoverbenix.learn_spring_framework_practice;

public class Car implements VehicleConsole {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void getMake() {
        System.out.println("Make: " + make);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void getModel() {
        System.out.println("Model: " + model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void setYear(int year) {
        this.year = year;
    }

   

}

