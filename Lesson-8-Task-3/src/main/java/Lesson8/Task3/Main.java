package Lesson8.Task3;

public class Main {
    public static void main(String[] args) {
        TwoWayList peterList = new TwoWayList(3);
            peterList.display();
            System.out.println(peterList.size());
            peterList.add("Michael");
            peterList.display();
        try {
            peterList.add(8, "JOHN");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getClass().getSimpleName());
            System.out.println(exception.getMessage());
        }
            peterList.add(2, "KRIS");
            peterList.display();
        try {
            peterList.remowe(10);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getClass().getSimpleName());
            System.out.println(exception.getMessage());
        }
            peterList.remowe(0);
            peterList.display();
            System.out.println(peterList.size());
    }
}

