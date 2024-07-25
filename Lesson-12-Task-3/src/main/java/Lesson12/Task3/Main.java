package Lesson12.Task3;
import com.sun.net.httpserver.HttpServer;
import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Integer> listOfInt = List.of(10, 30, 23, 100);
        byte[] arrayOfbyte = getArrayOfbyte(listOfInt);
        startServer();
        String result = getSumFromServer(arrayOfbyte);
        System.out.println(result);
    }
    private static byte[] getArrayOfbyte(List<Integer> list){
        byte[] arrayOfbyte = new byte[list.size()];
        int arraytOfbyteCounter = 0;
        for(Integer number : list){
            arrayOfbyte[arraytOfbyteCounter] = number.byteValue();
            arraytOfbyteCounter++;
        }
        return arrayOfbyte;
    }
    private static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8050),0);
        SumHandler sumHandler = new SumHandler();
        server.createContext("/counting/sum",sumHandler);
        server.setExecutor(null);
        server.start();
    }
    private static String getSumFromServer(byte[] dataToSend) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8050/counting/sum"))
                .PUT(HttpRequest.BodyPublishers.ofByteArray(dataToSend))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
