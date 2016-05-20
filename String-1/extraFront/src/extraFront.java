/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
 * <p>
 * extraFront("Hello") → "HeHeHe"
 * extraFront("ab") → "ababab"
 * extraFront("H") → "HHH"
 */
public class extraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }

    public static String extraFront(String str) {
        if (str.length() > 2) {
            String s = str.substring(0, 2);
            return s + s + s;
        }
        return str + str + str;
    }
}
