import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("browser", "chrome");
        config.put("environment", "QA");
        System.out.println(config.get("browser"));
    }
}