package Lesson12.Task1;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args ) {
        String webAddress = "https://www.google.pl/";
        String fileName = "data.txt";
        try {
            getHtmlBody(webAddress, fileName);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static void getHtmlBody(String webAddress, String fileName) throws Exception {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(webAddress))
                .GET()
                .build();
        httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofFile(Path.of(fileName)));
    }
}
