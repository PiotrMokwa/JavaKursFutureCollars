package Lesson6.Task4;

public class Main {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        String wordToFind = "Peter";
        boolean isWordInFile =  file.isWordInFile(wordToFind, file.read("data.txt"));
        System.out.println("'" + wordToFind + "' text "
                + (isWordInFile ? "is " : "is not ") + "in file:");
    }
}
