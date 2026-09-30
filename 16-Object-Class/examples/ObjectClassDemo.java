class TestResult {
    String name;
    TestResult(String name) { this.name = name; }
    @Override public String toString() { return "TestResult{name='" + name + "'}"; }
}
public class ObjectClassDemo {
    public static void main(String[] args) {
        TestResult result = new TestResult("Login");
        System.out.println(result);
        System.out.println(result.getClass().getName());
    }
}