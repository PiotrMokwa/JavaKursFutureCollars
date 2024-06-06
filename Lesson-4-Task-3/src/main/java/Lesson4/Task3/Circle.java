package Lesson4.Task3;
import Lesson4.Figures;
public class Circle implements Figures {
    @Override
    public double getArea(int r) {
        return (double) Math.round((Math.PI * Math.pow(r, 2) * 100)) /100;
    }
    @Override
    public double getPerimeter(int r) {
        return (double) Math.round((2 * Math.PI * r) * 100) /100 ;
    }
}
