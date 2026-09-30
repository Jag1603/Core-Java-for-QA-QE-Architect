import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SmokeTest {}

public class AnnotationsDemo {
    @SmokeTest
    public void loginTest() {}
    public static void main(String[] args) throws Exception {
        System.out.println(AnnotationsDemo.class.getMethod("loginTest")
                .isAnnotationPresent(SmokeTest.class));
    }
}