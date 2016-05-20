/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.
 * <p>
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */
public class deFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    public static String deFront(String str) {
        String first = str.substring(0, 1);
        String secon = str.substring(1, 2);
        String firstPart = str.substring(0, 2);
        String secondPart = str.substring(2, str.length());
        String newS;

        if (firstPart.equals("ab")) {
            newS = "ab" + secondPart;
        } else if (first.equals("a")) {
            newS = "a" + secondPart;
        } else if (secon.equals("b")) {
            newS = "b" + secondPart;
        } else {
            return str.substring(3, str.length());
        }

        return newS;


    }

}
