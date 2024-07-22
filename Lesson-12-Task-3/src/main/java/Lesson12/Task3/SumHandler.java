package Lesson12.Task3;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class SumHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        InputStream inputStream = exchange.getRequestBody();
        byte[] numbersRead = inputStream.readAllBytes();
        String response = String.valueOf(
                sum(numbersRead)
        );
        exchange.sendResponseHeaders(200, response.length());
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(response.getBytes());
        outputStream.close();
    }
    private static int sum(byte[] numbersRead) {
        int numberConverted = 0;
        int sum = 0;
        for (byte number : numbersRead) {
            numberConverted = number;
            sum += numberConverted;
        }
        return sum;
    }
}
