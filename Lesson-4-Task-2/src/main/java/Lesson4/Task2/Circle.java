package Lesson4.Task2;
import Lesson4.Shape;
public class Circle extends Shape {
    double r;
     Circle(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return (double) Math.round((Math.PI * Math.pow(r, 2)) * 100) /100;
    }
    @Override
    public double getPerimeter() {
        return (double) Math.round(2 * Math.PI * r * 100) /100 ;
    }
}
