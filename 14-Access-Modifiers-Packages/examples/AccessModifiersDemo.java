public class AccessModifiersDemo {
    public String publicValue = "visible everywhere";
    protected String protectedValue = "subclasses/package";
    String packageValue = "same package";
    private String privateValue = "class only";

    public static void main(String[] args) {
        AccessModifiersDemo x = new AccessModifiersDemo();
        System.out.println(x.publicValue);
    }
}