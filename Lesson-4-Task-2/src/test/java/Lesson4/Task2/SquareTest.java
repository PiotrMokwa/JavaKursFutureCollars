package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SquareTest {
    @Test
    public void getAreaSquareTest(){
        //given
        int a = 2;
        int b = 2;
        //when
        Rectangle rectangleTest = new Rectangle(a,b);
        double result = rectangleTest.getArea();
        //then
        Assertions.assertEquals(4,result);
    }
    @Test
    public void getPerimeterSquareTest(){
        //given
        int a = 2;
        int b = 2;
        //when
        Rectangle rectangleTest = new Rectangle(a,b);
        double result = rectangleTest.getPerimeter();
        //then
        Assertions.assertEquals(8,result);
    }
}