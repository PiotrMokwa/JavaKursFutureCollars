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
    public boolean isWordInFile(CharSequence wordToFind, String textInFile) {
        return textInFile.contains(wordToFind);
    }
}