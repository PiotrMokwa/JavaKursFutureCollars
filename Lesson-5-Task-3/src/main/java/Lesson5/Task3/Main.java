package Lesson5.Task3;
public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.getSum());
        System.out.println(calculator.getDivide());
        System.out.println(calculator.getSubtract());
        System.out.println(calculator.getMultiply());
    }
}
