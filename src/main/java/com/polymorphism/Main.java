package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Name", "Address", "Department", "Email", 1000);
        System.out.println("Salary Employee: " + employee.getSalary());

        SalariedEmployee salariedEmployee = new SalariedEmployee("Name", "Address", "Department", "Email", 1000, 100);
        System.out.println("Salaried Employee: " + salariedEmployee.getSalary());

        DailyEmployee dailyEmployee = new DailyEmployee("Name", "Address", "Department", "Email", 0, 100, 30);
        System.out.println("Daily Employee: " + dailyEmployee.getSalary());

        HourlyEmplyee hourlyEmplyee = new HourlyEmplyee("Name", "Address", "Department", "Email", 0, 100, 50);
        System.out.println("Hourly Employee: " + hourlyEmplyee.getSalary());


        // Method overriding
        Employee e1 = new Employee("Name", "Address", "Department", "Email", 1000);
        e1 = new SalariedEmployee("Name", "Address", "Department", "Email", 1000, 100);
        e1.getSalary(); // Working
        // e1.getBonus(); // Not Working (because it should be in both classes Emloyee and SalariedEmployee)
        e1 = new DailyEmployee("Name", "Address", "Department", "Email", 0, 100, 30);
        e1 = new HourlyEmplyee("Name", "Address", "Department", "Email", 0, 100, 50);


        Employee e2 = new SalariedEmployee();
        e2.print();

        SalariedEmployee e3 = new SalariedEmployee();
        e3.print();
    }
}
