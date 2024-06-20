package Lesson6.Task5;

public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        char[] textRevert = file.getTextRevert(file.read("data.txt"));
        System.out.println(textRevert);
    }
}
