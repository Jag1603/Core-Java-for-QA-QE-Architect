import java.util.concurrent.*;

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> results = new ConcurrentHashMap<>();
        results.put("Login", "PASS");
        results.put("Search", "PASS");
        System.out.println(results);
    }
}