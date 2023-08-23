package com.interfacee;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    static void newMethod(){
        System.out.println("aaa");
    };
}
