package Lesson6.Task1;
public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile("data.txt");
        file.read();
        file.display();
    }
}