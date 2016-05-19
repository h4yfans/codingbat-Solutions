/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * <p>
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * <p>
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class firstHalf {
    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}
