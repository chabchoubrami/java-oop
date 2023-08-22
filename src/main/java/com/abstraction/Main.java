package com.abstraction;

public class Main {
    static void fun1(Suv obj) {
        obj.autoPilot();
    }

    static void fun2(Hatchback obj) {
        obj.autoPilot();
    }

    //    method overloading (polymorphism)
    static void fun(Car obj) {
        obj.autoPilot();
    }

    public static void main(String[] args) {
        Suv suv = new Suv(10, 10, 10, 10);
        suv.autoPilot();

        fun1(suv);
        fun2(new Hatchback());
        fun(new Hatchback());
    }
}
