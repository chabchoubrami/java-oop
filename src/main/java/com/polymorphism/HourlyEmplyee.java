package com.polymorphism;

public class HourlyEmplyee extends Employee{
    private float workOurPrice;
    private int hourlyRate;

    public HourlyEmplyee(String name, String address, String department, String email, float salary, float workOurPrice, int hourlyRate) {
        super(name, address, department, email, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

    public float getWorkOurPrice() {
        return workOurPrice;
    }

    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float getSalary(){
        return workOurPrice * hourlyRate;
    }
}
