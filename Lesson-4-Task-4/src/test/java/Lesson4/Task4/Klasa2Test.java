package Lesson4.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Klasa2Test {
@Test
    void shouldFormatTextLowerCases(){
//    given
    String textTest = "Peter";
//    when
    Klasa2 text = new Klasa2();
    String result = text.formatText(textTest);
//    then
    Assertions.assertEquals("peter",result);
    }
}
