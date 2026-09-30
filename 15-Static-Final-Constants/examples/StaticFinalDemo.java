public class StaticFinalDemo {
    static int testCount;
    static final String ENVIRONMENT = "QA";

    StaticFinalDemo() { testCount++; }

    public static void main(String[] args) {
        new StaticFinalDemo();
        new StaticFinalDemo();
        System.out.println("Tests: " + testCount + ", Env: " + ENVIRONMENT);
    }
}