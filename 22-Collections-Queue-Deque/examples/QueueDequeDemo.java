import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDequeDemo {
    public static void main(String[] args) {
        Deque<String> tests = new ArrayDeque<>();
        tests.addLast("Login");
        tests.addLast("Payment");
        System.out.println(tests.removeFirst());
    }
}