package com.mycompany;

public class Account {
    private int accountNumber;
    private String name;
    private float amount;

    public void insert(int accountNumber, String name, float amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public void deposite(float amount) {
        this.amount += amount;
        System.out.println(amount + " deposited in account " + accountNumber);
    }

    public void withdraw(float amount) {
        if(amount > this.amount) {
            System.out.println("Insufficient funds");
        } else {
            this.amount -= amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
