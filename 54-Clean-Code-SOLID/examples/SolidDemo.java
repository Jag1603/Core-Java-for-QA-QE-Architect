interface LoginService { void login(String user); }
class UiLoginService implements LoginService {
    public void login(String user) { System.out.println("UI login: " + user); }
}
public class SolidDemo {
    public static void main(String[] args) {
        LoginService service = new UiLoginService();
        service.login("tester");
    }
}