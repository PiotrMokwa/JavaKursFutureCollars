package Lesson5.Task3.MathematicOperations;
public interface Sum {
    default double getSum(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
}
