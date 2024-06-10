package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RectangleTest {
    @Test
    public void getPerimeterRectangleTest(){
        //given
        int a = 2;
        int b = 4;
        //when
        Rectangle rectangleTest = new Rectangle(a,b);
        double result = rectangleTest.getPerimeter();
        //then
        Assertions.assertEquals(12,result);
    }
    @Test
    public void getAreaRectangleTest(){
        //given
        int a = 2;
        int b = 4;
        //when
        Rectangle rectangleTest = new Rectangle(a,b);
        double result = rectangleTest.getArea();
        //then
        Assertions.assertEquals(8,result);
    }
}
