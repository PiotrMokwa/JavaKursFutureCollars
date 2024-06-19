package Lesson6.Task6;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    private final Path filePath;
    public String textInFile;
    public String textUpperCase;
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
        public String getTextUpperCase(){
            this.textUpperCase = this.textInFile.toUpperCase();
            return this.textUpperCase;
        }
}