public class MathematicsOperations {
    public boolean isDividedBy2(double number) {
        return number % 2 == 0;
    }

    public int DigitSumOfNumber(String number) {
        char[] numbersInCharArray = number.toCharArray();
        int digit = 0;
        int sum = 0;
        char minusOrPlusHolder = 0;
        for (char singleChar : numbersInCharArray) {
            if (singleChar == '-') {
                minusOrPlusHolder = singleChar;
            } else {
                if (minusOrPlusHolder != 0) {
                    int digitWithPlusOrMinus = Integer.parseInt(minusOrPlusHolder + String.valueOf(singleChar));
                    sum += digitWithPlusOrMinus;
                    minusOrPlusHolder = 0;
                } else {
                    digit = Integer.parseInt(String.valueOf(singleChar));
                    sum += digit;
                }
            }
        }
        return sum;
    }

}
