package Lesson2Task6;
public class Lesson2Task6 {
    public static String weekDayCheck(int weekDayNumber){
        switch (weekDayNumber){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }
    }
}