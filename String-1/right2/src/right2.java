/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
 * <p>
 * right2("Hello") → "loHel"
 * right2("java") → "vaja"
 * right2("Hi") → "Hi"
 */
public class right2 {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }

    public static String right2(String str) {
        String first = str.substring(str.length() - 2, str.length());
        String end = str.substring(0, str.length() - 2);
        return first + end;
    }

}

