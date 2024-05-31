package Lesson2Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Lesson2Task5Test {
    @Test
    public void shouldIsNumberOddTrue(){
        //given
        int number =3;
        //when
        boolean result = Lesson2Task5.isNumberOdd(number);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldIsNumberOddFalse(){
        //given
        int number =4;
        //when
        boolean result = Lesson2Task5.isNumberOdd(number);
        //then
        Assertions.assertFalse(result);
    }
    @Test
    public void shouldIsNumberEvenTrue(){
        //given
        int number =4;
        //when
        boolean result = Lesson2Task5.isNumberEven(number);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldIsNumberEvenFalse(){
        //given
        int number =3;
        //when
        boolean result = Lesson2Task5.isNumberEven(number);
        //then
        Assertions.assertFalse(result);
    }
}