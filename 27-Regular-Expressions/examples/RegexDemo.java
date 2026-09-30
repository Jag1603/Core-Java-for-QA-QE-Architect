import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        String log = "Status=200";
        Matcher matcher = Pattern.compile("Status=(\\d+)").matcher(log);
        if (matcher.find()) System.out.println("Status: " + matcher.group(1));
    }
}