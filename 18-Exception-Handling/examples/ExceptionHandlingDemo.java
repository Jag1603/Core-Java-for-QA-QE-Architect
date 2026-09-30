public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Test calculation failed: " + e.getMessage());
        } finally {
            System.out.println("Cleanup");
        }
    }
}