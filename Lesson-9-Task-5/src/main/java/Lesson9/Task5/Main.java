package Lesson9.Task5;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> baseList = new ArrayList<>();
        listFill(baseList);
        BombelSorting.display(baseList);
        BombelSorting.display(BombelSorting.sort(baseList));
    }
    private  static void listFill(List<Integer> baseList) {
        for (int i = 0; i < 10; i++) {
            int value = (int)(Math.random() * 10);
            baseList.add(Integer.valueOf(String.valueOf(value))) ;
        }
    }
}
