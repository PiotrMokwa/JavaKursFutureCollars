package Lesson6.Task6;
public class Main {
    public static void main(String[] args){
        DataFile file = new DataFile("data.txt");
        file.read();
        OutpotFile outputFile = new OutpotFile("output.txt");
        outputFile.create();
        outputFile.write(file.getTextUpperCase());
    }
}
