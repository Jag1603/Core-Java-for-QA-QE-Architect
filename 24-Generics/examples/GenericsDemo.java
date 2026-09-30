import java.util.*;

class TestData<T> {
    private final T value;
    TestData(T value) { this.value = value; }
    T get() { return value; }
}
public class GenericsDemo {
    public static void main(String[] args) {
        TestData<String> data = new TestData<>("QA");
        System.out.println(data.get());
    }
}