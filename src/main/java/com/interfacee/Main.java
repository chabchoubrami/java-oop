package com.interfacee;

import java.util.ArrayList;
import java.util.List;

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


        List <Integer> list = new ArrayList();
        CarV1 car3 = new CarV1();
        if (car3 instanceof MarkerInterface)
            System.out.println("Yes, it is a MarkerInterface");
        else
            System.out.println("No, it is not a MarkerInterface");

        GenericInterface <Car> carV1Obj = new Car();
        Car carV2Obj = carV1Obj.carModel();
    }
}
