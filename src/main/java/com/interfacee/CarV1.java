package com.interfacee;

public class CarV1 implements SelffDrivable, Movable, MarkerInterface {
    private int x, y;
    private int numberOfPassengers;

    public CarV1() {
    }

    public CarV1(int x, int y) {
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
        System.out.println("Driving v1");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}
