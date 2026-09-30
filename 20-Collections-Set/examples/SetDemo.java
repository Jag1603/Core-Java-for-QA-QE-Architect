import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> environments = new HashSet<>();
        environments.add("QA");
        environments.add("QA");
        environments.add("UAT");
        System.out.println(environments);
    }
}