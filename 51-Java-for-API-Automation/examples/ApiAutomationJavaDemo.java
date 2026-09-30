import java.net.URI;
import java.net.http.*;

public class ApiAutomationJavaDemo {
    public static void main(String[] args) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .GET().build();
        System.out.println("HTTP request created: " + request.method());
    }
}