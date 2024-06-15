package Lesson5.Task3.MathematicOperations;
public interface Multiplication {
    default double getMultiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
}
