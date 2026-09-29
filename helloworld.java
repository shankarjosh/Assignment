import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class helloworld {
    public static void main(String[] args) throws IOException {
        System.out.println("Server is listening on port 8001...");
    }
}
