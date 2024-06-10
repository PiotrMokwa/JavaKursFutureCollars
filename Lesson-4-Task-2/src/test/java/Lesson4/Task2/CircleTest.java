package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CircleTest {
    @Test
    public void getAreaCircleTest(){
    //given
    int r =2;
    // when
    Circle circle = new Circle(r);
    double result = circle.getArea();
    //then
        Assertions.assertEquals(12.57,result);
    }
    @Test
    public void getPerimeterCircleTest(){
        //given
        int r =2;
        // when
        Circle circle = new Circle(r);
        double result = circle.getArea();
        //then
        Assertions.assertEquals(12.57,result);
    }

}
