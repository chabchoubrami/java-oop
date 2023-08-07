package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Jack", "email", "phone", "department", "address", 1990, "projectName");
        //developer.setName("John");
        System.out.println(developer.getName());

        System.out.println("----------------");
        MobileDeveloper mobileDeveloper = new MobileDeveloper();
    }
}
