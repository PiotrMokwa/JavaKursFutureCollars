package Lesson3.Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MathTest {
    @Test
    public  void isTriangleRectangular(){
        //given
        int a=4;
        int b=3;
        int c=5;
        // when
       boolean result = Math.isTriangleRectangular(a,b,c);
        //then
        Assertions.assertTrue(result);
    }
}
