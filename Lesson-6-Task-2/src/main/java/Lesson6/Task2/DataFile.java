package Lesson6.Task2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    public DataFile(){}
    public String getReadFile(String filePath){
        String fileText = "";
        try {
            fileText = Files.readString(Path.of(filePath));
        } catch(IOException e){
            e.printStackTrace();
        }
        return fileText;
    }
        public void printOddLines(String fileText) {
          String[] fileTextArray;
           if(fileText == null){
               System.out.println("File wasn't read");
           }else {
               fileTextArray = fileText.split(System.lineSeparator());
               int arrayIndex = 0;
                   for (String text : fileTextArray) {
                       boolean odd = !(arrayIndex % 2 == 0);
                       if (odd) {
                           System.out.println(fileTextArray[arrayIndex]);
                       }
                       arrayIndex++;
                   }
           }
        }
}
