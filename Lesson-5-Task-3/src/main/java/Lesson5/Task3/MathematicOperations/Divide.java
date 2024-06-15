package Lesson5.Task3.MathematicOperations;
public interface Divide {
    default double getDivide(double firstNumber, double secondNumber){
           return firstNumber / secondNumber;
    }
}
