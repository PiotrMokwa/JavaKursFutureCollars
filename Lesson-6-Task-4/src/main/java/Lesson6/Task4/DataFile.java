package Lesson6.Task4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class DataFile {
    private final Path path;
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
        public void getWord(CharSequence word){
            boolean isWordInFile = this.textInFile.contains(word);
            System.out.println("'" + word + "' text "
                    + (isWordInFile ? "is in file" : "is not in file: ")
                    + " " + path);
        }
}