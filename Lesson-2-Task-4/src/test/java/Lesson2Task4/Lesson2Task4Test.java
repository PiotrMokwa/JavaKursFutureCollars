package Lesson2Task4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson2Task4Test {

@Test
    public void shouldAgeGreater18(){

        //given age
        int age = 20;
        //when
        boolean testAge =  Lesson2Task4.isAgeGreater18(age);
        //then
        Assertions.assertTrue(testAge);
    }
}
