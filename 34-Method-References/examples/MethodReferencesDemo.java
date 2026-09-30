import java.util.*;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        List<String> tests = List.of("Login", "Search", "Checkout");
        tests.forEach(System.out::println);
    }
}