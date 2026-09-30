public class MethodsDemo {
    static int add(int a, int b) { return a + b; }
    static void log(String... messages) {
        for (String message : messages) System.out.println(message);
    }
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        log("START", "PASS", "END");
    }
}