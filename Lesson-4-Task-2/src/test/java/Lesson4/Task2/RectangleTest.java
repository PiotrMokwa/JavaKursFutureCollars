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
        Rectangle rectangleTest = new Rectangle();
        double result = rectangleTest.getPerimeter(a,b);
        //then
        Assertions.assertEquals(12,result);
    }
    @Test
    public void getAreaRectangleTest(){
        //given
        int a = 2;
        int b = 4;
        //when
        Rectangle rectangleTest = new Rectangle();
        double result = rectangleTest.getPerimeter(a,b);
        //then
        Assertions.assertEquals(12,result);
    }
}
