import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> tests = new ArrayList<>();
        tests.add("Login");
        tests.add("Checkout");
        tests.forEach(System.out::println);
    }
}