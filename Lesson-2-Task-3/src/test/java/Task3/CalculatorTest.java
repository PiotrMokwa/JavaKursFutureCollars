package Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void shouldSum() {
        //given a,b
        int a = 2;
        int b = 5;
        //when
        int result = Calculator.sum(a, b);
        //then
        Assertions.assertEquals(7, result);
    }
@   Test
    public void shouldSubstract(){
        //given a,b
        int a = 2;
        int b = 5;
        //when
        int result = Calculator.substract(a,b);
        //then
        Assertions.assertEquals(-3,result);
    }
    @Test
    public  void shouldMultiply(){
        //given a,b
        int a = 2;
        int b = 5;
        //when
        int result = Calculator.multiply(a,b);
        //then
        Assertions.assertEquals(10,result);
    }
    @Test
    public void shouldDivide() {
        //given a,b
        float a = 10;
        float b = 5;
        //when
        float result = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(2, result);
    }
}
