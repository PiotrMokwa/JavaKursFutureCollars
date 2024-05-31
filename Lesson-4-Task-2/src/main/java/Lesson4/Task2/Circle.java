package Lesson4.Task2;
import Lesson4.Shape;
public class Circle extends Shape {
    @Override
    protected double getArea(int a, int b) {
        return 0;
    }
    @Override
    protected double getPerimeter(int a, int b, int c) {
        return 0;
    }
    @Override
    protected double getArea(int r) {
        return (double) Math.round((Math.PI * Math.pow(r, 2)) * 100) /100;
    }
    @Override
    protected double getPerimeter(int r) {
        return (double) Math.round((2 * Math.PI * r) * 100) /100;
    }
    @Override
    protected double getPerimeter(int a, int b) {
        return 0;
    }
}
