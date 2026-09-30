class Browser { void open() { System.out.println("Browser"); } }
class Chrome extends Browser { @Override void open() { System.out.println("Chrome"); } }
public class PolymorphismDemo {
    public static void main(String[] args) {
        Browser browser = new Chrome();
        browser.open();
    }
}