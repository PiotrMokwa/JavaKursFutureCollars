package Lesson4.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Klasa1Test {
    @Test
    void shouldFormatTextUpperCase() {
//        given
        String textTest = "Peter";
//        when
        Klasa1 text = new Klasa1();
        String result = text.formatText(textTest);
//        then
        Assertions.assertEquals("PETER", result);
    }
}

