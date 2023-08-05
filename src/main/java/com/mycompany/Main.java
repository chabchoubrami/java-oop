package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "123"), student2 = new Student("Jane", "1234");
        System.out.println(student2.isLoggedIn(2, "1234"));
        System.out.println(student2.toString());

        String password = "12345678";
        if (Student.validatePassword(password)) {
            Student student = new Student("John", password);
            System.out.println("Student created successfully");
            System.out.println(student.isLoggedIn(3, password));
        } else {
            System.out.println("Please enter a valid password.");
        }
    }
}
