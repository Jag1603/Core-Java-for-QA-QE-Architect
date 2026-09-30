import java.util.*;

public class JavaInterviewPrograms {
    static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    static boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(reverse(input));
    }
    public static void main(String[] args) {
        System.out.println(reverse("SDET"));
        System.out.println(isPalindrome("madam"));
    }
}