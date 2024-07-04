package Lesson7.Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YearOperationsTest {
    @ParameterizedTest(name = "Is {0}-th month in year {1} season?")
    @CsvSource(value = {"1:Winter",
            "5: Spring",
            "15:15 number is not such a month",
            "-1:-1 number is not such a month"}, delimiter = ':')
    @DisplayName("Witch season according to the month")
    public void shouldGetSeason(int monthNumber, String season) {
        //given
        YearOperations year = new YearOperations();
        //when
        String result = year.getSeason(monthNumber);
        //then
        Assertions.assertEquals(season, result);
    }
}
