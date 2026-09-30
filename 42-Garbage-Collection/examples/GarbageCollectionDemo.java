public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Object testData = new Object();
        testData = null;
        System.gc();
        System.out.println("Object is now eligible for GC");
    }
}