package Lesson12.Task4;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2, 2, 8);
        Thread firstThread = new Thread(
                () -> {
            System.out.println(getAverage(integerList));
        });
        Thread secondThread = new Thread(
                () -> {
            System.out.println(getSum(integerList));
        });
        firstThread.start();
        secondThread.start();
    }
    public static Integer getAverage(List<Integer> list) {
        int listSize = list.size();
        return list.stream()
                .reduce(0, (Integer::sum))
                / listSize;
    }
    public static Integer getSum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
