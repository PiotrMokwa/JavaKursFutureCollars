package Lesson10.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String  numberPESEL = "02032034562";
        NumberPeselValidate.isNumberPeselCorect(numberPESEL);
        numberPESEL = "0#032034562";
        NumberPeselValidate.isNumberPeselCorect(numberPESEL);
        numberPESEL = "0#03";
        NumberPeselValidate.isNumberPeselCorect(numberPESEL);
    }

}
