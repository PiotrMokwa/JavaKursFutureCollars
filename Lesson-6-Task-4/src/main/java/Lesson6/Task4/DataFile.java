package Lesson6.Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    public DataFile() {
    }
    public String read(String path) {
        String textInFile = "";
        try {
            textInFile = Files.readString(Path.of(path));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return textInFile;
    }
    public void getWord(CharSequence wordToFind, String textInFile) {
        boolean isWordInFile = textInFile.contains(wordToFind);
        System.out.println("'" + wordToFind + "' text "
                + (isWordInFile ? "is in file" : "is not in file: "));
    }
}