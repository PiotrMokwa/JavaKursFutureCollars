import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    DataFile file = new DataFile("data.txt");
    file.writeToFile("Kurs-Java-Lekcja 6-Pliki-Wyjątki-Pliki-Koniec pliku");
  }
}
