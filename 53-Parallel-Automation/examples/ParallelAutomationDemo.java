public class ParallelAutomationDemo {
    private static final ThreadLocal<String> driver = new ThreadLocal<>();
    public static void main(String[] args) {
        Runnable test = () -> {
            driver.set("Driver-" + Thread.currentThread().getId());
            System.out.println(driver.get());
            driver.remove();
        };
        new Thread(test).start();
        new Thread(test).start();
    }
}