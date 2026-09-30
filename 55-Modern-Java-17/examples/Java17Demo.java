record TestResult(String name, String status) {}

public class Java17Demo {
    static String describe(Object value) {
        if (value instanceof String s) return "String: " + s;
        if (value instanceof Integer i) return "Integer: " + i;
        return "Other";
    }
    public static void main(String[] args) {
        System.out.println(new TestResult("Login", "PASS"));
        System.out.println(describe("QA"));
    }
}