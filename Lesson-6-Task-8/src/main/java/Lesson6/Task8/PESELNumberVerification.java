package Lesson6.Task8;

public abstract class PESELNumberVerification {
    public static boolean isNumberString(Object number) throws WrongTypeOfDataException {
        boolean isNumber = number.getClass().getSimpleName().equals("String");
        if (!isNumber) {
            throw new WrongTypeOfDataException("Wrong PESEL type");
        } else {
            return true;
        }
    }
    public static boolean isNumberLengthCorrect(String number) throws IllegalLengthException {
        final int PESELLength = 11;
        boolean isPeselLenghtOK = (number.length() == PESELLength);
        if (!isPeselLenghtOK) {
            throw new IllegalLengthException("Wrong PESEL lenght");
        }
        return isPeselLenghtOK;
    }
}
