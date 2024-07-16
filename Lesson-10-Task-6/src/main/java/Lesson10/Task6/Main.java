package Lesson10.Task6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args){
        String name = "John";
        int birthYear = 1988;
        int birthDay = 20;
            Month birthMonth = Month.of(2);
            LocalDate birthDate = LocalDate.of(birthYear, birthMonth,birthDay);
            Period yearsOld = Period.between(birthDate,LocalDate.now());
            System.out.println(name
                    +" was born in " + birthDate
                    + ". "
                    + name + " have " + yearsOld.getYears() + " years old. He was born on "
                    +  birthDate.getDayOfWeek()
                    + ". The " + weekOfYear(birthDate.getDayOfYear()) + " -th week of year"
            );
    }
    public static int weekOfYear(int numberOfDays){
        return numberOfDays/7;
    }
}
