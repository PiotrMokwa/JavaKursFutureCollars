package Lesson6.Task6;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    public String textUpperCase;
        public DataFile(){}
        public String read(String filePath){
        String textInFile = "";
            try {
                textInFile = Files.readString(Path.of(filePath));
            }catch (IOException e){
                e.printStackTrace();
            }
            return textInFile;
        }
        public String getTextUpperCase(String textInFile){
            textUpperCase = textInFile.toUpperCase();
            return textUpperCase;
        }
}