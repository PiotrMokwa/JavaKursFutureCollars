package Lesson4.Task2;
import Lesson4.Shape;
public class Circle extends Shape {
   private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (double) Math.round((Math.PI * Math.pow(radius, 2)) * 100) /100;
    }
    @Override
    public double getPerimeter() {
        return (double) Math.round(2 * Math.PI * radius * 100) /100 ;
    }
}
