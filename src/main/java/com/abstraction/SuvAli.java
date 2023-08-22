package com.abstraction;

public abstract class SuvAli extends Car{
    @Override
    void autoPilot() {
        System.out.println("SUV Ali Auto Pilot");
    }

    abstract void streamingServices();
    abstract void parkingSensors();
}
