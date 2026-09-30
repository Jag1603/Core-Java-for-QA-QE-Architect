interface BrowserDriver { void start(); }
class ChromeDriverFactory {
    static BrowserDriver create() {
        return () -> System.out.println("Chrome driver created");
    }
}
public class DesignPatternsDemo {
    public static void main(String[] args) {
        BrowserDriver driver = ChromeDriverFactory.create();
        driver.start();
    }
}