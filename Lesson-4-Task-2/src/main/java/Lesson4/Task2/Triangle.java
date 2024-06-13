package Lesson4.Task2;
import Lesson4.Shape;
public class Triangle extends Shape {
     private int a;
     private int height;
     private int b;
     private int c;
    Triangle(int sideA, int sideB, int sideC, int height){
        this.a = sideA;
        this.height = height;
        this.b = sideB;
        this.c = sideC;
    }
    @Override
    public double getArea() {
        return (double) (a * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
