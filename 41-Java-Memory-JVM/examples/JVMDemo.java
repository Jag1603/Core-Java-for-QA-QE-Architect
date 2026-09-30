public class JVMDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Processors: " + runtime.availableProcessors());
        System.out.println("Free memory: " + runtime.freeMemory());
        System.out.println("Max memory: " + runtime.maxMemory());
    }
}