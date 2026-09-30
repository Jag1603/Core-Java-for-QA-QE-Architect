import java.util.concurrent.*;

public class ConcurrencyDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<String> result = pool.submit(() -> "Parallel test completed");
        System.out.println(result.get());
        pool.shutdown();
    }
}