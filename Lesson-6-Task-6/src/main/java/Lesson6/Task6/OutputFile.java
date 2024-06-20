package Lesson6.Task6;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputFile{
        public static void write(String text, String filePath){
           Path convertedFilePath = Path.of(filePath);
            if (!Files.exists(convertedFilePath)) {
                try {
                    Files.createFile(convertedFilePath);
                } catch (IOException e) {
                    System.out.println(e.initCause(e));
                }
            }
            try {
               Files.writeString(convertedFilePath, text);
           } catch (IOException e){
                System.out.println(e.initCause(e));
           }
        }
}
