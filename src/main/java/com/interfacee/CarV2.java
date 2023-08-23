package com.interfacee;

public class CarV2 implements SelffDrivable, Movable {
    private int x, y;
    private int numberOfPassengers;

    public CarV2() {
    }

    public CarV2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void destination(String destination) {
        System.out.println("Destination: " + destination);
    }

    @Override
    public void drive() {
        System.out.println("Driving v2");
    }
}
