package com.finall;

public class Main {
    public static void main(String[] args) {
//        final int STUDENT_ID; // Blank final variable
//        STUDENT_ID = 123;

        Student student = new Student(111, "John", 1990);
//        student.STUDENT_ID = 123; // Cannot assign a value to a final variable

        final Student student2 = new Student(123, "Jack", 1990);
//        student2 = new Student(123, "Ja", 1990); // Cannot assign a value to a final variable (reference)
    }
}
