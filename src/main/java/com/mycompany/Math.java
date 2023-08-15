package com.mycompany;

public class Math {
    int val;

    public Math() {
    }

    public Math(int val) {
        this.val = val;
    }

    Math add(Math a) {
        Math c = new Math();
        c.val = a.val + this.val;
        return c;
    }

    boolean isEqual(Math a) {
        return a.val == this.val;
    }
}
