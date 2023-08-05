package com.mycompany;

public class OuterClass {
    static int x = 10;

    public static class InnerClass {
        public void print() {
            System.out.println("This is an inner class");
            System.out.println("x = " + x);
        }
    }
}
