package Lesson9.Task5;
import java.util.ArrayList;
import java.util.List;
public class BombelSorting {
    public static <T extends Number> List<T> sort(List<T> baseList) {
        List<T> sortedList = copyList(baseList);
        int arrayCounter = 0;
        T elementHolder;
            for (int i = 0; i < sortedList.size() - 1; i++) {
                for (int j = 0; j < sortedList.size() - 1; j++) {
                    if (sortedList.get(arrayCounter).doubleValue() > sortedList.get(arrayCounter + 1).doubleValue()) {
                        elementHolder = sortedList.get(arrayCounter + 1);
                        sortedList.set(arrayCounter + 1, sortedList.get(arrayCounter));
                        sortedList.set(arrayCounter, elementHolder);
                    }
                    arrayCounter++;
                 }
                    arrayCounter = 0;
            }
        return sortedList;
    }
    public static <T extends Number> List<T> copyList(List<T> baseList) {
        List<T> newList = new ArrayList<>();
        int indexCounter = 0;
            for (T element : baseList) {
                newList.add(indexCounter, element);
            }
     return newList;
    }
    public static <T extends Number> void display(List<T> list) {
        for (T element : list) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
