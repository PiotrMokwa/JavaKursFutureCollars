package Lesson6.Task4;
public class Main {
    public static void  main(String[] args){
        DataFile file = new DataFile("data.txt");
        file.readFile();
        file.getWord("Peter");
    }
}
