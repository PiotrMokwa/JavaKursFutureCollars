package Lesson6.Task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class DataFile {
     public DataFile() {
     }
     public String getReadText(String path) {
         String readedText ="";
         try {
            readedText = Files.readString(Path.of(path));
         }catch (IOException e){
             System.out.println(e);
             e.printStackTrace();
         }
         return readedText;
     }
     public void display(String readedText){
          System.out.println(Objects.requireNonNullElse(readedText, "File wasn't read"));
     }
}
