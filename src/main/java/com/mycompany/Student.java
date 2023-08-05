package com.mycompany;

public class Student {
    private final int number;
    private final String name;
    private final String password;
    private boolean loggedIn;
    private static int count = 1;
    private static final String college = "IT";
    private static final int minimalPasswordLength = 6;

    public Student(String name, String password) {
        this.number = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public boolean isLoggedIn(int enteredNumber, String enteredPassword) {
        if (enteredNumber == number && enteredPassword.equals(password)) {
            loggedIn = true;
            return true;
        } else {
            loggedIn = false;
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        return password.length() >= minimalPasswordLength;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
