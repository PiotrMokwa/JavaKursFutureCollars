package Lesson6.Task4;

public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        file.getWord("Peter", file.read("data.txt"));
    }
}
