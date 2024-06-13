package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CircleTest {
    @Test
    public void shouldAreaCircle(){
        //given
        int radius =2;
        Circle circle = new Circle(radius);
        // when
        double result = circle.getArea();
        //then
        Assertions.assertEquals(12.57,result);
    }
    @Test
    public void shouldPerimeterCircle(){
        //given
        int radius =2;
        Circle circle = new Circle(radius);
        // when
        double result = circle.getArea();
        //then
        Assertions.assertEquals(12.57,result);
    }

}
