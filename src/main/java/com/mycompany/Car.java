package com.mycompany;

public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModel(int model) {
        if (model >= 2015) this.model = model;
        else System.out.println("Model can't be less than 2015");
    }

    public int getModel() {
        return model;
    }
}
