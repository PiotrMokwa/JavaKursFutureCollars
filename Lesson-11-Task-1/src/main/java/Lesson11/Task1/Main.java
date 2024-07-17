package Lesson11.Task1;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[]args){
        IntStream stream = IntStream.range(1,10);
        stream.forEach(System.out::print);
        System.out.println();
        IntStream stream2 = IntStream.range(0,10);
        IntPredicate isNotNull = (int i) -> i != 0;
        IntPredicate isDivideByThree= (int i) -> i % 3 == 0;
        stream2
                .filter(isNotNull)
                .filter(isDivideByThree)
                .forEach(value -> System.out.println("Number divided by three :" + value));
    }
}
