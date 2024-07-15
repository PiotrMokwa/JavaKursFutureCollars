package Lesson10.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class NumberPeselValidate {
    public static  void isNumberPeselCorect(String numberPESEL){

        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(numberPESEL);
        boolean matches = matcher.matches();
        System.out.println(matches);

    }
}
