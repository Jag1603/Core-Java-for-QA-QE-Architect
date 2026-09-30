public class Operators {
    public static void main(String[] args) {
        int passed = 95, total = 100;
        System.out.println("Passed: " + (passed == total));
        System.out.println("Pass rate: " + ((double) passed / total) * 100);
    }
}