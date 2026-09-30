public class TestingJavaDemo {
    static void assertEquals(Object expected, Object actual) {
        if (!java.util.Objects.equals(expected, actual))
            throw new AssertionError("Expected " + expected + " but got " + actual);
    }
    public static void main(String[] args) {
        assertEquals(200, 200);
        System.out.println("Assertion passed");
    }
}