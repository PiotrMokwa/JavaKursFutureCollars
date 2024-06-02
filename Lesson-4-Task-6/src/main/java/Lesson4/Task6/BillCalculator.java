package Lesson4.Task6;
public class BillCalculator {
    protected double calculate(double billValue, float paymentOfService){
        return billValue + paymentOfService;
    }
    protected double calculate(double billValue, float paymentOfService, double discount){
        return billValue + paymentOfService - discount;
    }
    protected double calculate(double billValue, float paymentOfService, int paymentForTakAwayPackage){
        return billValue + paymentOfService + paymentForTakAwayPackage;
    }
}