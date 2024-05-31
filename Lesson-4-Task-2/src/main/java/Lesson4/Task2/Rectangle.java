package Lesson4.Task2;
import Lesson4.Shape;
public class Rectangle extends Shape {
    @Override
    protected double getArea(int a,int b) {
        return a * b;
    }
    @Override
    protected double getPerimeter(int a, int b, int c) {
        return 0;
    }
    @Override
    protected double getArea(int r) {
        return 0;
    }
    @Override
    protected double getPerimeter(int a, int b) {
        return 2 * a + 2 * b;
    }
}
