package com.interfacee;

public interface SelffDrivable {
    void destination(String destination);
    void drive();
    default void newMethod(){
        System.out.println("New Method");
    };
}
