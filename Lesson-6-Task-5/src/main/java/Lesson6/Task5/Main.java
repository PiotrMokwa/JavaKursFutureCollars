package Lesson6.Task5;

public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        file.printTextRevert(file.read("data.txt"));
    }
}
