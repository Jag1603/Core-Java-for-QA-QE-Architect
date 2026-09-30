abstract class Page {
    abstract void load();
    void close() { System.out.println("Close page"); }
}
class LoginPage extends Page {
    @Override void load() { System.out.println("Load login page"); }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Page page = new LoginPage();
        page.load();
        page.close();
    }
}