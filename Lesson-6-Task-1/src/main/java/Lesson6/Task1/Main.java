package Lesson6.Task1;
public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        String readedText = file.getReadText("data.txt");
        file.display(readedText);
    }
}