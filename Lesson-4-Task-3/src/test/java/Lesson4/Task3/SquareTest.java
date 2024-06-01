package Lesson4.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SquareTest {
    @Test
    public void getAreaSquareTest(){
//        given
        int a = 2;
//        when
        Square square = new Square();
        double result = square.getArea(a);
//        then
        Assertions.assertEquals(4,result);
    }
    @Test
    public void getPerimeterSquareTest(){
//        given
        int a = 2;
//        when
        Square square = new Square();
        double result = square.getPerimeter(a);
//        then
        Assertions.assertEquals(8,result);
    }
}