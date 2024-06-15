package Lesson5.Task3;
import Lesson5.Task3.MathematicOperations.Divide;
import Lesson5.Task3.MathematicOperations.Multiplication;
import Lesson5.Task3.MathematicOperations.Subtraction;
import Lesson5.Task3.MathematicOperations.Sum;
public class Calculator implements Sum, Subtraction, Multiplication, Divide {
   private final double firstNumber;
   private final double secondNumber;
    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double getSum() {
        return Sum.super.getSum(this.firstNumber, this.secondNumber);
    }
    public double getSubtract() {
        return Subtraction.super.getSubtracts(firstNumber, secondNumber);
    }
    public double getMultiply() {
        return Multiplication.super.getMultiply(firstNumber, secondNumber);
    }
    public double getDivide() {
        return Divide.super.getDivide(firstNumber, secondNumber);
    }
}
