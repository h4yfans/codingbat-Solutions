/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
 * <p>
 * extraEnd("Hello") → "lololo"
 * extraEnd("ab") → "ababab"
 * extraEnd("Hi") → "HiHiHi"
 */
public class extraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    public static String extraEnd(String str) {

        String last3 = str.substring(str.length() - 2, str.length());
        return last3 + last3 + last3;
    }


}
