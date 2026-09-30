class BaseTest {
    void start() { System.out.println("Starting test"); }
}
class LoginTest extends BaseTest {
    void execute() { System.out.println("Login test"); }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.start();
        test.execute();
    }
}