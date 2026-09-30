import java.lang.reflect.*;

class LoginPage {
    public void login() { System.out.println("Login executed"); }
}
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Method method = LoginPage.class.getMethod("login");
        method.invoke(new LoginPage());
    }
}