package com.Cinema.HR;
public class Main {
    public static void main(String[] args){
        TicketSeller emploee1 = new TicketSeller(2010,3000,"Adam","Szczęsny");
        Manager emploee2 = new Manager(2000,4000,"Jan","Kowalski",10);
        emploee1.printCompanyWorkingYears();
        emploee1.printBasicSalery();
        emploee1.printMonthlySalery();
        emploee2.printCompanyWorkingYears();
        emploee2.printBasicSalery();
        emploee2.printMonthlySalery();
    }
}
