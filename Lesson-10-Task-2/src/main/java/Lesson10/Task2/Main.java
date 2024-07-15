package Lesson10.Task2;
public class Main {
    public static void main(String[] args){
        String  numberPESEL = "02032034562";
        NumberPESELValidate.isNumberPESELCorrect(numberPESEL);
        numberPESEL = "0#032034562";
        NumberPESELValidate.isNumberPESELCorrect(numberPESEL);
        numberPESEL = "0#03";
        NumberPESELValidate.isNumberPESELCorrect(numberPESEL);
    }

}
