class TestCase {
    String name;
    TestCase(String name) { this.name = name; }
    void execute() { System.out.println("Executing: " + name); }
}
public class ClassesObjects {
    public static void main(String[] args) {
        new TestCase("Login Test").execute();
    }
}