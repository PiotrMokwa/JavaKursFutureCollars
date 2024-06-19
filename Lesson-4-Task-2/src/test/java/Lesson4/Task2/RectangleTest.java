package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RectangleTest {
    @Test
    public void shouldGetPerimeterRectangle(){
        //given
        int a = 2;
        int b = 4;
        Rectangle rectangleTest = new Rectangle(a,b);
        //when
        double result = rectangleTest.getPerimeter();
        //then
        Assertions.assertEquals(12,result);
    }
    @Test
    public void shouldGetAreaRectangle(){
        //given
        int a = 2;
        int b = 4;
        Rectangle rectangleTest = new Rectangle(a,b);
        //when
        double result = rectangleTest.getArea();
        //then
        Assertions.assertEquals(8,result);
    }
}
