import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> browser = Optional.ofNullable(System.getenv("BROWSER"));
        System.out.println(browser.orElse("chrome"));
    }
}