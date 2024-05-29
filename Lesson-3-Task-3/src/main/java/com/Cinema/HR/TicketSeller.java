package com.Cinema.HR;
public class TicketSeller extends BaseEmploee {
   public TicketSeller(int yearOfEmployment ,int basicSalary, String name, String lastName){
       this.yearOfEmployment = yearOfEmployment;
       this.basicSalary = basicSalary;
       this.name = name;
       this.lastName = lastName;
   }
    public void printMonthlySalery(){
        System.out.println("Ticket Seller "
                + this.name
                + " "
                + this.lastName
                + " Monthly sallery "
                +   this.calculateMonthlySalary()
                + "zł");
    }
    public void printBasicSalery(){
        System.out.println("Ticket Seller "
                + this.name
                + " "
                + this.lastName
                + " basic sallery "
                +   this.basicSalary
                + "zł");
    }
}
