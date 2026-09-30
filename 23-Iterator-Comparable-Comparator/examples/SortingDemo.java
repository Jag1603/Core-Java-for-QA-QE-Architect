import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> responseTimes = new ArrayList<>(List.of(300, 100, 200));
        responseTimes.sort(Comparator.naturalOrder());
        for (Iterator<Integer> it = responseTimes.iterator(); it.hasNext();)
            System.out.println(it.next());
    }
}