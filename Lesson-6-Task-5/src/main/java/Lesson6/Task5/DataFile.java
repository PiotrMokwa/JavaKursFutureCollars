package Lesson6.Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    public DataFile() {
    }
    public String read(String filePath) {
        String textInFile = "";
        try {
            textInFile = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textInFile;
    }
    public void printTextRevert(String textInFile) {
        char[] textArray = textInFile.toCharArray();
        for (int i = textArray.length - 1; i >= 0; i--) {
            System.out.print(textArray[i]);
        }
    }
}
