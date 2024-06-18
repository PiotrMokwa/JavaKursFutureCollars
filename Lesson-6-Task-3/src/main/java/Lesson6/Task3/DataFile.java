package Lesson6.Task3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataFile {
    private Path path;
    private String textInFile;
        public DataFile(String path){
            this.path = Path.of(path);
        }
        public void readFile(){
            try {
                this.textInFile = Files.readString(this.path);
            }catch(IOException exception){
                exception.printStackTrace();
            }
        }
        public void printCharsNumber(){
            System.out.println("Chars number in file "
                    + this.path + ": " +
                    + this.textInFile.length());
        }
}
