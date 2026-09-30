public class WrapperClassesDemo {
    public static void main(String[] args) {
        Integer testCount = 10;
        int primitive = testCount;
        String value = "200";
        int statusCode = Integer.parseInt(value);
        System.out.println(primitive + " " + statusCode);
    }
}