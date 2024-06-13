package Lesson4.Task2;
import Lesson4.Shape;
    public class Rectangle extends Shape {
     private double a;
     private double b;
     public Rectangle(double sideA, double sideB){
        this.a = sideA;
        this.b = sideB;
     }
     @Override
     public double getArea() {
        return a * b;
    }
     @Override
     public double getPerimeter() {
        return 2 * a + 2 * b;
    }
}
