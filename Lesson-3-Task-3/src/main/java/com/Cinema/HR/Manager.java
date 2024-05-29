package com.Cinema.HR;
public class Manager extends BaseEmploee {
final int additionalSalery = 5000;
int bonus = 500;
    public Manager(int yearOfEmployment ,int basicSalary, String name, String lastName, int bonus){
        this.yearOfEmployment = yearOfEmployment;
        this.basicSalary = basicSalary;
        this.name = name;
        this.lastName = lastName;
        this.bonus = bonus;
    }
    public int calculateMonthlySalary(){
        return additionalSalery + bonus + super.calculateMonthlySalary();
    }
    public void printMonthlySalery(){
        System.out.println("Manager "
                + this.name
                + " "
                + this.lastName
                + " Monthly sallery "
                +   this.calculateMonthlySalary()
                + "zł");
    }
    public void printBasicSalery(){
        System.out.println("Manager "
                + this.name
                + " "
                + this.lastName
                + " basic sallery "
                +   this.basicSalary
                + "zł");
    }
}



