public class StringsDemo {
    public static void main(String[] args) {
        String actual = "Login successful";
        String expected = "Login successful";
        System.out.println(actual.equals(expected));

        StringBuilder log = new StringBuilder();
        log.append("TEST=").append("Login").append(" STATUS=PASS");
        System.out.println(log);
    }
}