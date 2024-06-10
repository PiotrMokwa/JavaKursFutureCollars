package Lesson4.Task2;
import Lesson4.Shape;
public class Triangle extends Shape {
     int a;
     int h;
     int b;
     int c;
    Triangle(int sideA, int sideB, int sideC, int height){
        this.a = sideA;
        this.h = height;
        this.b = sideB;
        this.c = sideC;
    }
    @Override
    public double getArea() {
        return (double) (a * h) / 2;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
