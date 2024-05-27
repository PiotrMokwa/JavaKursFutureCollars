package Lesson2Task6;

//Lekcja 2 - mvn, junit - Zadanie 6 - Dni tygodnia
//        Zaimplementuj metodę, która na podstawie argumentu wejściowego
//        (liczba całkowita) zwróci nazwę dnia tygodnia.
//        Jeżeli argument wejściowy jest równy
//●     1 - 5 wówczas metoda powinna zwrócić dzień tygodnia, np. “Monday”,
//        ●     6 lub 7 metoda powinna zwrócić “Weekend”
//        ●     >7 metoda zwraca komunikat “There is no such a day!”
//
//
//
//Do powstałego kodu należy również dopisać testy jednostkowe.


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson2Task6Test {

    @Test
    public void shouldWeekDayCheck() {

        //given
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Weekend", "Weekend", "There is no such a day!"};
        /* int mon = 1;
        int tue = 2;
        int Wed = 3;
        int thu = 4;
        int fir = 5;
        int sat = 6;
        int sun = 7;
        int autOfWeek = 8;
        */
        for (int i = 1; i < 8; i++) {
            //when
            String result = Lesson2Task6.weekDayCheck(i);
            //then
            Assertions.assertSame(weekDays[i-1], result);
        }

    }

}
