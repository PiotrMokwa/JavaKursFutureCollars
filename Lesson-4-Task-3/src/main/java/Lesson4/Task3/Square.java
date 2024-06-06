package Lesson4.Task3;
import Lesson4.Figures;
public class Square implements Figures {
    @Override
    public double getArea(int a) {
        return Math.pow(a,2);
    }
    @Override
    public double getPerimeter(int a) {
        return 4*a;
    }
}
