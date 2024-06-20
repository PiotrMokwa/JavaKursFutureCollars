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
    public char[] getTextRevert(String textInFile) {
        char[] textArray = textInFile.toCharArray();
        char[] textRevertArray = new char[textArray.length];
        int forvardCounter = 0;
        for (int backwardsCounter = textArray.length - 1; backwardsCounter >= 0; backwardsCounter--) {
            textRevertArray[forvardCounter] = textArray[backwardsCounter];
            forvardCounter++;
        }
        return textRevertArray;
    }
}
