package com.Cinema.HR;
public class BaseEmploee {
    protected String name;
    protected String lastName;
    protected int basicSalary = 3000;
    protected int yearOfEmployment;
    protected final int currentYear = 2024;
    protected BaseEmploee(){
    }
    protected int basicSalary(){
        return basicSalary;
    }
    public int calculateMonthlySalary(){
        return basicSalary;
    }
    protected void printCompanyWorkingYears(){
        int WorkingYears = currentYear - yearOfEmployment;
        System.out.println(this.name
                + " "
                + this.lastName
                +" work in Company "
                + WorkingYears
                + " years");
    }
}