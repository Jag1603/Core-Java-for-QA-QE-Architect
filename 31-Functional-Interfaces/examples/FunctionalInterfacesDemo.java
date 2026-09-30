import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Predicate<Integer> successful = code -> code == 200;
        Function<String, Integer> length = String::length;
        Consumer<String> log = System.out::println;
        Supplier<String> environment = () -> "QA";
        System.out.println(successful.test(200));
        System.out.println(length.apply("Login"));
        log.accept(environment.get());
    }
}