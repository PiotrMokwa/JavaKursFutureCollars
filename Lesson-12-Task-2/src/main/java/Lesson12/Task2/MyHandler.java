package Lesson12.Task2;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class MyHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException{
        InputStream inputStream = exchange.getRequestBody();
        byte[] message =  inputStream.readAllBytes();
        String string = new String(message);
        String response = string.toUpperCase() ;
        exchange.sendResponseHeaders(200,response.length());
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(response.getBytes());
        outputStream.close();
    }
}
