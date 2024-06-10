package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    @Test
    public void getAreaTestTriangle(){
    //given
        int a = 2;
        int b = 2;
        int c = 3;
        int h = 2;
    //when
    Triangle triangle = new Triangle(a,b,c,h);
    double result =triangle.getArea();
    //then
    Assertions.assertEquals(2,result);
    }
    @Test
    public void getPerimeterTestTriangle(){
        //given
        int a = 2;
        int b = 2;
        int c = 3;
        int h = 2;
        //when
        Triangle triangle = new Triangle(a,b,c,h);
        double result =triangle.getPerimeter();
        //then
        Assertions.assertEquals(7,result);
    }
}