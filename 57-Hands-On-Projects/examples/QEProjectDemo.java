import java.util.*;

public class QEProjectDemo {
    public static void main(String[] args) {
        List<String> testResults = List.of("PASS", "PASS", "FAIL", "PASS");
        long passed = testResults.stream().filter("PASS"::equals).count();
        System.out.println("Passed tests: " + passed);
        System.out.println("Next: connect this structure to TestNG, Selenium, API and DB layers.");
    }
}