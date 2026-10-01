//public class Exercise01 {
//    public static void main(String[] args) {
//        System.out.println("Practice 03: Arithmetic, relational, logical, ternary and bitwise operators.");
//        // TODO: Implement a QA/SDET-oriented example for this topic.
//    }
//}

 public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Arthametic operators.");
        int a = 20;
        int b = 10;
        int sum = (a+b);
        int sub = (a-b);
        int mul = (a*b);
        int div = (a/b);
        int rem = (a%b);
        System.out.println("sum = " + sum +"\nsub = "+ sub + "\nmul = " +mul +"\ndiv = "+ div+ "\nrem = " + rem);
        System.out.println("Relational operators.\n"+ "a > b = " + (a > b) + "\na < b = " + (a < b) + "\na >= b = " + (a >= b) + "\na <= b = " + (a <= b) + "\na == b = " + (a == b) + "\na != b = " + (a != b));
        System.out.println("Logical operators.\n"+ "(a > b) && (a < 10) = " + ((a > b) && (a < 10))+ "\n(a > b) || (a < 10) = " + ((a > b) || (a < 10)) + "\n!(a > b) = " + (!(a > b)));
        //&&  → Both should be true ||  → At least one should be true !   → Reverse the result
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Ternary operator.\n" + result);// ? says as if and : as else
        System.out.println("Bitwise operators.\n" + "a & b = " + (a & b)+ "\na | b = " + (a | b) + "\na ^ b = " + (a ^ b)+ "\n~a = " + (~a));
        }
};
