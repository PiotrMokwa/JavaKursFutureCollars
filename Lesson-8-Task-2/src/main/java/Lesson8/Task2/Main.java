package Lesson8.Task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        PeterList peterList = new PeterList(numberList);
                System.out.println("Base " + peterList);
                System.out.println("List size " + peterList.size());
                System.out.println("Is List empty? " + peterList.isEmpty());
            int addedElementToEnd = 10;
                peterList.add(addedElementToEnd);
                System.out.println("List with added " + addedElementToEnd
                        + " element to the end: " + peterList);
            int returnIndex = 5;
                System.out.println("List with returned " + returnIndex
                        + "-th element: " + peterList.get(returnIndex));
            int addedElement = 750;
            int addedIndex = 2;
            int removedIndex = 1;
                try {
                    peterList.add(addedIndex, addedElement);
                    peterList.remove(removedIndex);
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Wrong index!");
                    System.out.println(Arrays.toString(exception.getStackTrace()));
                }
                System.out.println("List with added " + addedElement
                            + " element on " + addedIndex
                            + " index: " + peterList);
                System.out.println("List with removed index number " + removedIndex + " : " + peterList);
    }
}


