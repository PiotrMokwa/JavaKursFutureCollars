package Lesson2Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson2Task5Test {

    @Test

    public void shouldIsNumberOdd(){

        //given
        int number =3;
        //when
        boolean result = Lesson2Task5.isNumberOdd(number);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldIsNumberEven(){

        //given
        int number =4;
        //when
        boolean result = Lesson2Task5.isNumberEven(number);
        //then
        Assertions.assertTrue(result);
    }
}