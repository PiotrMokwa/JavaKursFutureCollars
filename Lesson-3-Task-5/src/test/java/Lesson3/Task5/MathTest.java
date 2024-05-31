package Lesson3.Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MathTest {
    @Test
    public  void isTriangleRectangularTrue(){
        //given
        int a=4;
        int b=3;
        int c=5;
        // when
       boolean result = Math.isTriangleRectangular(a,b,c);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    public  void isTriangleRectangularFalse(){
        //given
        int a=10;
        int b=3;
        int c=5;
        // when
        boolean result = Math.isTriangleRectangular(a,b,c);
        //then
        Assertions.assertFalse(result);
    }

}
