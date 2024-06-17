package Lesson6.Task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class DataFile {
   private final Path filePath;
   private String readedText;
     public  DataFile(String path) {
        this.filePath = Path.of(path);
     }
      public void read(){
        try {
            this.readedText = Files.readString(this.filePath);
        }catch (IOException e){
           System.out.println(e);
          e.printStackTrace();
        }
      }
      public void display(){
          System.out.println(Objects.requireNonNullElse(this.readedText, "File wasn't read"));
      }
}
