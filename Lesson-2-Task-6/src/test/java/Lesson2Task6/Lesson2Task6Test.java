package Lesson2Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Lesson2Task6Test {
    @Test
    public void shouldWeekDayCheckMonday() {
        //given
        int mon = 1;
            //when
            String result = Lesson2Task6.weekDayCheck(mon);
            //then
            Assertions.assertSame("Monday", result);
    }
    @Test
    public void shouldWeekDayCheckTuesday() {
        //given
        int tue = 2;
        //when
        String result = Lesson2Task6.weekDayCheck(tue);
        //then
        Assertions.assertSame("Tuesday", result);
    }
    @Test
    public void shouldWeekDayCheckWednesday() {
        //given
        int wed = 3;
        //when
        String result = Lesson2Task6.weekDayCheck(wed);
        //then
        Assertions.assertSame("Wednesday", result);
    }
    @Test
    public void shouldWeekDayCheckThursday() {
        //given
        int thu = 4;
        //when
        String result = Lesson2Task6.weekDayCheck(thu);
        //then
        Assertions.assertSame("Thursday", result);
    }
    @Test
    public void shouldWeekDayCheckFriday() {
        //given
        int fri = 5;
        //when
        String result = Lesson2Task6.weekDayCheck(fri);
        //then
        Assertions.assertSame("Friday", result);
    }
    @Test
    public void shouldWeekDayCheckSaturday() {
        //given
        int sat = 6;
        //when
        String result = Lesson2Task6.weekDayCheck(sat);
        //then
        Assertions.assertSame("Weekend", result);
    }
    @Test
    public void shouldWeekDayCheckSunday() {
        //given
        int sun = 7;
        //when
        String result = Lesson2Task6.weekDayCheck(sun);
        //then
        Assertions.assertSame("Weekend", result);


    }
    @Test
    public void shouldWeekDayCheckError() {
        //given
        int autOfWeek = 8;
        //when
        String result = Lesson2Task6.weekDayCheck(autOfWeek);
        //then
        Assertions.assertSame("There is no such a day!", result);
    }
}
