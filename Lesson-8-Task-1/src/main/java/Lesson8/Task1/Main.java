package Lesson8.Task1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> namesBaseList = Arrays.asList("Anna",
                "Katarzyna", "Tymon", "Tadeusz",
                "Anna", "Karolina", "Dorota", "Piotr");
        Set<String> namesListWithoutDuplicates = new TreeSet<>(namesBaseList);
        System.out.println("0) Base list: " + namesBaseList);
        System.out.print("1) List without duplicates: ");
            int counderOfIndex = 0;
            for (String name : namesListWithoutDuplicates) {
                System.out.print((counderOfIndex == 0 ? " " : ", ") + name);
                counderOfIndex++;
            }
        System.out.println();
        System.out.print("2) Elements in reverse sequence: ");
            boolean isLastElement;
            for (int i = namesBaseList.size() - 1; i >= 0; i--) {
                isLastElement = i == namesBaseList.size() - 1;
                System.out.print((isLastElement ? " " : ", ") + namesBaseList.get(i));
            }
        System.out.println();
        String newName = "Joanna";
        String nameToChange = "Anna";
        nameChange(namesBaseList, nameToChange, newName);
    }
    public static void nameChange(List<String> namesList, String nameToChange, String newName) {
        System.out.println("3) Elements after change :" + nameToChange + "->" + newName);
            for (int i = 0; i < namesList.size(); i++) {
                if (namesList.get(i).equals(nameToChange)) {
                    namesList.set(i, newName);
                }
                    System.out.print((i == 0 ? " " : ", ") + namesList.get(i));
            }
    }
}
