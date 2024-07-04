public class CheckDivideBy3 {
    public CheckDivideBy3() {
    }
    public void validate(int[] values) {
        boolean isValuesDivideBy3;
        int divideNumber = 3;
        for (int value : values) {
            isValuesDivideBy3 = value % divideNumber == 0;
            System.out.println(isValuesDivideBy3);
            try {
                if (!isValuesDivideBy3) {
                    throw new IllegalArgumentException("Liczba " + value + " nie jest podzielna przez " + divideNumber);
                }
            } catch (IllegalArgumentException info) {
                System.out.println(info.getMessage());
            }
        }
    }
}
