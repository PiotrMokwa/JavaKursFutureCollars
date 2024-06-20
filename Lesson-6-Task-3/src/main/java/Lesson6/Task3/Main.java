package Lesson6.Task3;

public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        file.printCharsNumber(file.read("data.txt"));
    }
}
