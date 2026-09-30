import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> tests = List.of("Login", "Payment", "Search");
        tests.forEach(test -> System.out.println("Running " + test));
    }
}