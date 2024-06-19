package Lesson4.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    @Test
    public void shouldGetAreaTriangle(){
        //given
        int a = 2;
        int b = 2;
        int c = 3;
        int h = 2;
        Triangle triangle = new Triangle(a,b,c,h);
        //when
        double result =triangle.getArea();
        //then
        Assertions.assertEquals(2,result);
      }
    @Test
    public void shouldGetPerimeterTriangle(){
        //given
        int a = 2;
        int b = 2;
        int c = 3;
        int h = 2;
        Triangle triangle = new Triangle(a,b,c,h);
        //when
        double result =triangle.getPerimeter();
        //then
        Assertions.assertEquals(7,result);
    }
}