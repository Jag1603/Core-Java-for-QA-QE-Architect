public class FrameworkReliabilityDemo {
    static void executeTest() {
        try {
            throw new RuntimeException("Element not found");
        } catch (RuntimeException e) {
            System.err.println("FAILURE: " + e.getMessage());
            throw e;
        }
    }
    public static void main(String[] args) {
        try { executeTest(); } catch (RuntimeException ignored) {}
    }
}