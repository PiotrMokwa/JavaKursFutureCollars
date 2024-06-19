package Lesson6.Task2;
public class Main {
    public static void main(String[] args){
        DataFile file = new DataFile();
        file.printOddLines(file.getReadFile("data.txt"));
    }
}
