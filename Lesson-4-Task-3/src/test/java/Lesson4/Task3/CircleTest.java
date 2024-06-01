package Lesson4.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CircleTest {
    @Test
    public void shouldGetAreaCircleTest(){
//        given
        int r = 2;
//        when
        Circle circle = new Circle();
        double result = circle.getArea(r);
//        then
        Assertions.assertEquals(12.57,result);
    }
    @Test
    public void shouldGetPerimeterCircleTest(){
//        given
        int r = 3;
//        when
        Circle circle = new Circle();
        double result = circle.getPerimeter(r);
//        then
        Assertions.assertEquals(18.85,result);
    }
}