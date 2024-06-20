package Lesson6.Task7;

public abstract class Element {
    public static double getElement(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Wrong argument " + number);
        }
        return Math.sqrt(number);
    }
}
