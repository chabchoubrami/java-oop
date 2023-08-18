package com.relationship;

public class Employee {
    private int id;
    private float salary;
    private PersonaInformation personaInformation; // relationship composition
    private Department department; // relationship aggregation

    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, String yearOfBirth, Department department) {
        this.id = id;
        this.salary = salary;
        // this.personaInformation = personaInformation;
        this.personaInformation = new PersonaInformation(firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personaInformation=" + personaInformation +
                ", department=" + department +
                '}';
    }
}
