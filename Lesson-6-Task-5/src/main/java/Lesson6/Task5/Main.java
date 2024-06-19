package Lesson6.Task5;
public class Main {
    public static void main(String[] args){
        DataFile file = new DataFile("data.txt");
        file.read();
        System.out.println(file.textInFile);
        file.getTextRevert();
    }
}
