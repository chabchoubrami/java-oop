package com.polymorphism;

public class SalariedEmployee extends Employee {
    private float bonus;

    SalariedEmployee() {

    }

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bonus) {
        super(name, address, department, email, salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + bonus;
    }

    public static void print() {
        System.out.println("Sub-Class: SalariedEmployee");
    }
}
