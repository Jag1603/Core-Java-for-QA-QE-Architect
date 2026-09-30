import java.util.logging.*;

public class LoggingDemo {
    private static final Logger LOG = Logger.getLogger(LoggingDemo.class.getName());
    public static void main(String[] args) {
        LOG.info("Test execution started");
        LOG.warning("Example warning");
    }
}