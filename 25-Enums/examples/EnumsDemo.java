enum Browser { CHROME, FIREFOX, EDGE }
public class EnumsDemo {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;
        switch (browser) {
            case CHROME -> System.out.println("Chrome selected");
            default -> System.out.println("Other browser");
        }
    }
}