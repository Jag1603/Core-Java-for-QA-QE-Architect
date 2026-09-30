class TestConfig {
    private int timeout;
    public void setTimeout(int timeout) {
        if (timeout <= 0) throw new IllegalArgumentException("Timeout must be positive");
        this.timeout = timeout;
    }
    public int getTimeout() { return timeout; }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        TestConfig config = new TestConfig();
        config.setTimeout(15);
        System.out.println(config.getTimeout());
    }
}