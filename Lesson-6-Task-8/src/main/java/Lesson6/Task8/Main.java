package Lesson6.Task8;

public class Main {
    public static void main(String[] args) {
        String PESEL = "12324756323";
        try {
            System.out.println(PESELNumberVerification.isNumberString(PESEL));
            System.out.println(PESELNumberVerification.isNumberLengthCorrect(PESEL));
        } catch (WrongTypeOfDataException | IllegalLengthException PESELNumber) {
            System.out.println(PESELNumber.getMessage());
        }
    }
}
