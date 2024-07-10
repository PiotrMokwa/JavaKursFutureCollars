package Lesson9.Task2;
public class Main {
    public static void main(String[] arg) {
        PeterQueue peterQueue = new PeterQueue(Integer.valueOf("10"));
        peterQueue.display();
        System.out.println("Is element added? " + peterQueue.add(Integer.valueOf("20")));
        peterQueue.display();
        System.out.println("Is element added?" + peterQueue.add(Integer.valueOf("30")));
        peterQueue.display();
        System.out.println(" Removed element " + peterQueue.remove());
        peterQueue.display();
        System.out.println(" Get head element " + peterQueue.element());
        peterQueue.display();
    }
}
