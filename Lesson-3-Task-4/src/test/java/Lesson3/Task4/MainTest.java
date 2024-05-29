package Lesson3.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MainTest {

@Test
    public void shouldConvertMinutesToSeconds(){
    //given
    int minutesTested = 60;
    Conversion minutes = new Conversion();
    //when
    int  result= minutes.convertMinutesToSeconds(minutesTested);
    //then
    Assertions.assertEquals(3600,result);
}

}
