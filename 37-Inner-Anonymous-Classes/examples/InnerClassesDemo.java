public class InnerClassesDemo {
    static class TestData {
        void print() { System.out.println("Nested test data"); }
    }
    public static void main(String[] args) {
        new TestData().print();
        Runnable task = new Runnable() {
            public void run() { System.out.println("Anonymous task"); }
        };
        task.run();
    }
}