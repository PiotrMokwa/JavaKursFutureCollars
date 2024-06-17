package Lesson6.Task2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    private String filePath;
    private String fileText;
    private String[] fileTextArray;
        public DataFile(String filePath){
        this.filePath = filePath;
        }
        public void read(){
            try {
                fileText = Files.readString(Path.of(filePath));
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        public void printOddLines() {
           if(fileText == null){
               System.out.println("File wasn't read");
           }else {
               this.fileTextArray = this.fileText.split(System.lineSeparator());
               int arrayIndex = 0;
               for (String text : this.fileTextArray) {
                   boolean odd = !(arrayIndex % 2 == 0);
                   if (odd) {
                       System.out.println(fileTextArray[arrayIndex]);
                   }
                   arrayIndex++;
               }
           }
        }
}
