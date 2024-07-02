package Lesson5.Task3.MathematicOperations;
public interface Subtraction {
    default public double getSubtracts(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
