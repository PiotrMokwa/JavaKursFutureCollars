package Lesson12.Task2;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Main {
    public static void main(String[] args)  {
    try {
        String textToSend = "Today is a good film";
        startServer();
        startClient(textToSend);
    }catch (Exception exception){
        exception.printStackTrace();
        }
    }
    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
        server.createContext("/applications/tuUpperCase",new MyHandler());
        server.setExecutor(null);
        server.start();
    }
    public static void startClient(String textToSend) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().proxy(ProxySelector.of(new InetSocketAddress(8000))).build();
        HttpRequest httpRequest2 = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8000/applications/tuUpperCase"))
                .PUT(HttpRequest.BodyPublishers.ofString(textToSend)).build();
        HttpResponse<String> response2 = httpClient.send(httpRequest2, HttpResponse.BodyHandlers.ofString());
        System.out.println(response2.body());
    }
}
