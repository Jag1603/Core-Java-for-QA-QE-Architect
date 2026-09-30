import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws Exception {
        AtomicInteger counter = new AtomicInteger();
        Runnable task = counter::incrementAndGet;
        Thread a = new Thread(task);
        Thread b = new Thread(task);
        a.start(); b.start(); a.join(); b.join();
        System.out.println(counter.get());
    }
}