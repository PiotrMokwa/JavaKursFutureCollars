package Lesson6.Task6;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutpotFile{
    private final Path filePath;
        public OutpotFile(String path){
            this.filePath = Path.of(path);
        }
       public void create(){
           try {
               Files.createFile(this.filePath);
           } catch (IOException e){
               e.getStackTrace();
           }
       }
        public void write(String text){
           try {
               Files.writeString(this.filePath, text);
           } catch (IOException e){
               e.getStackTrace();
           }
        }
}
