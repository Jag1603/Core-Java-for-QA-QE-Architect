interface Report {
    void generate();
    default void format() { System.out.println("HTML format"); }
}
class AllureReport implements Report {
    public void generate() { System.out.println("Generating Allure report"); }
}
public class InterfacesDemo {
    public static void main(String[] args) {
        Report report = new AllureReport();
        report.generate();
        report.format();
    }
}