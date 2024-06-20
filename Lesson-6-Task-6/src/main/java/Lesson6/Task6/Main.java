package Lesson6.Task6;
public class Main {
    public static void main(String[] args){
        DataFile file = new DataFile();
        String fileTextUpperCase = file.getTextUpperCase((file.read("data.txt")));
        OutputFile.write(fileTextUpperCase,"output.txt");
    }
}
