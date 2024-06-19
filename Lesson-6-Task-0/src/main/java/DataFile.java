import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class DataFile {
    protected final Path filePath;
        public DataFile(String filePath) throws IOException {
            this.filePath = Paths.get(filePath);
        }
        public void writeToFile(String textToWrite) throws IOException {
            try
            {
                Files.createFile(this.filePath);
            } catch(IOException e) {
                e.printStackTrace();
            }
            String[] text = textToWrite.split("-");
                for(String singleWord : text) {
                    try {
                        Files.writeString(filePath, singleWord + System.lineSeparator(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
        }
}
