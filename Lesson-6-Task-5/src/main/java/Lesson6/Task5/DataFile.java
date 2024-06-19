package Lesson6.Task5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class DataFile {
   private final Path filePath;
   public String textInFile;
    public DataFile(String filePath){
        this.filePath = Path.of(filePath);
    }
    public void read(){
        try {
           this.textInFile = Files.readString(this.filePath);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void getTextRevert(){
        char[] textArray = this.textInFile.toCharArray();
          for(int i = textArray.length - 1; i >= 0 ; i-- ) {
            System.out.print(textArray[i]);
          }
    }
}
