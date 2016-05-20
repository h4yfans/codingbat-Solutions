/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.
 * <p>
 * minCat("Hello", "Hi") → "loHi"
 * minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */
public class minCat {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }

    public static String minCat(String a, String b) {

        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        } else {
            return a + b.substring(b.length() - a.length(), b.length());
        }

    }

}
