/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 * The substring may overlap with itself, so "Hi" yields "".
 * Otherwise, return the original string unchanged.
 * <p>
 * without2("HelloHe") → "lloHe"
 * without2("HelloHi") → "HelloHi"
 * without2("Hi") → ""
 */
public class without2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

    public static String without2(String str) {

        if (str.length() > 1) {
            if (str.length() == 2) return "";
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
                return str.substring(str.length());
            }
        }
        return str;
    }

}
