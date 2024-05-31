package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    @Test
    public void getAreaTestTriangle(){
    //given
     int a = 2;
     int h = 2;
    //when
    Triangle triangle = new Triangle();
    double result =triangle.getArea(a,h);
    //then
    Assertions.assertEquals(2,result);
    }
    @Test
    public void getPerimeterTestTriangle(){
        //given
        int a = 2;
        int h = 2;
        int c = 3;
        //when
        Triangle triangle = new Triangle();
        double result =triangle.getPerimeter(a,h,c);
        //then
        Assertions.assertEquals(7,result);
    }
}