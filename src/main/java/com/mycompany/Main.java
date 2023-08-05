package com.mycompany;

public class Main {
    static int x = 10;
    int y = 11;

    static {
        x = 20;
        System.out.println("This is a static block");
    }
    static {
        x = 30;
        System.out.println("This is a static block 2");
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(x);
        System.out.println(m.y);

        Student student = new Student("Sara", "123");

        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.print();
    }
}
