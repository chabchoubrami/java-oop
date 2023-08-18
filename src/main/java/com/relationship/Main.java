package com.relationship;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(123, "IT");
        Employee employee1 = new Employee(1, 2000, "John", "Smith", "Doe", "A+", "123456789", "American", "1990", department);
        // Employee employee2 = new Employee(2, 2000, "John", "Smith", "Doe", "A+", "123456789", "American", "1990", department);
        System.out.println(employee1.toString());
    }
}
