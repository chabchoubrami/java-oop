package com.mycompany;

public class Main {
    static void fun(Test obj) {
        obj.number++;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.number = 1;
        fun(obj);
        System.out.println("number = " + obj.number);
    }
}
