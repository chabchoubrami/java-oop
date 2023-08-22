package com.abstraction;

public class Suv extends Car{
    int x;
    Suv(int x, float height, float weight, int numberOfWheels){
        super(height, weight, numberOfWheels);
        this.x=x;
    }

    @Override
    void autoPilot() {
        System.out.println("SUV Auto Pilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV Streaming Services");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV Parking Sensors");
    }
}
