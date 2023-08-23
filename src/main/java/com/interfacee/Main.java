package com.interfacee;

public class Main {
    static void interfaceMethod(SelffDrivable obj) {
        obj.drive();
    }
    public static void main(String[] args) {
        SelffDrivable car1 = new CarV1();
        car1.drive();
//        SelffDrivable car2 = new CarV2();
//        car2.drive();
        car1 = new CarV2();
        car1.drive();

        interfaceMethod(new CarV1());
        interfaceMethod(new CarV2());
    }
}
