package Lesson7.Task5;

import java.time.DateTimeException;
import java.time.Month;

public class YearOperations {
    public YearOperations() {
    }

    public String getSeason(int monthNumber) {
        try {
            switch (Month.of(monthNumber)) {
                case DECEMBER:
                case JANUARY:
                case FEBRUARY:
                    return "Winter";
                case MARCH:
                case APRIL:
                case MAY:
                    return "Spring";
                case JUNE:
                case JULY:
                case AUGUST:
                    return "Summer";
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                    return "Autumn";
                default:
                    return monthNumber + "number is not such a month";
            }
        } catch (DateTimeException e) {
            return monthNumber + " number is not such a month";
        }
    }
}
