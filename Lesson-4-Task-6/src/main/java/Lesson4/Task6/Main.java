package Lesson4.Task6;
public class Main {
    public static void main(String[] args) {
        BillCalculator bill1 = new BillCalculator();
        double value1 = bill1.calculate(120.16, 20);
        double value2 = bill1.calculate(120.16, 20, 40.0);
        double value3 = bill1.calculate(120.16, 20, 20);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}