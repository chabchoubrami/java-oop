package com.abstraction;

public class Hatchback extends Car {
    @Override
    void autoPilot() {
        System.out.println("Hatchback Auto Pilot");
    }

    @Override
    void streamingServices() {
        System.out.println("Hatchback Streaming Services");
    }

    @Override
    void parkingSensors() {
        System.out.println("Hatchback Parking Sensors");
    }
}
