package Lesson4.Task2;
import Lesson4.Shape;
public class Triangle extends Shape {
    @Override
    protected double getArea(int a, int h) {
        return (double) (a * h) / 2;
    }
    @Override
    protected double getPerimeter(int a, int b, int c) {
        return a + b + c;
    }
    @Override
    protected double getArea(int r) {
        return 0;
    }
    @Override
    protected double getPerimeter(int r) {
        return 0;
    }
    @Override
    protected double getPerimeter(int a, int b) {
        return 0;
    }
}
