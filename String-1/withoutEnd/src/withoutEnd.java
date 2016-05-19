/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * <p>
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 * <p>
 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
 */

public class withoutEnd {
    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));


    }

    public static String withoutEnd(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return str.substring(str.length());
        }
    }
}
