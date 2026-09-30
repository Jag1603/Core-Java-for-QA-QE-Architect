import java.util.*;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> responseTimes = List.of(100, 250, 90, 300, 100);
        List<Integer> slow = responseTimes.stream()
                .filter(t -> t > 200)
                .distinct()
                .sorted()
                .toList();
        System.out.println(slow);
    }
}