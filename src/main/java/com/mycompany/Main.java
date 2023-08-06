package com.mycompany;

public class Main {
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int result = add(2, 3);
        System.out.println("result = " + result);

        Math math1 = new Math(5);
        Math math2 = new Math(10);
        Math math3 = math1.add(math2);
        System.out.println("math3 =" + math3.val);

        boolean isEqual = math1.isEqual(math2);
        System.out.println("isEqual = " + isEqual);
        math1=math2;
        if(math1 == math2) {
            System.out.println("math1 == math2");
        } else {
            System.out.println("math1 != math2");
        }
    }
}
