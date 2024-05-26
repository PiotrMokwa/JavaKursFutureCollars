package Lesson2Task5;

//Lekcja 2 - mvn, junit - Zadanie 5 - Liczby parzyste i nieparzyste
//Zaimplementuj metody, które sprawdzą czy liczba jest liczbą parzystą
//czy nieparzystą. Do powstałego kodu należy również dopisać
//testy jednostkowe.

public class Lesson2Task5 {

    public static boolean isNumberOdd(double number){

        return number % 2 != 0;
    }

    public static boolean isNumberEven(double number){

        return number % 2 == 0;
    }

    public static void main(String[] args){


    }

}