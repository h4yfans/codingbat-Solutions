/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 * <p>
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */
public class withoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
        System.out.println(withoutX2("xHi"));

    }

    public static String withoutX2(String str) {

        if (str.length() > 0) {
            if (str.equals("x"))
                return "";
            else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.substring(0, 1) + str.substring(2);
            }
        }
        return str;
    }


    public String withoutX2SECONDWAY(String str) {
        if (str.length() == 1 && str.charAt(0) == 'x')
            return "";

        if (str.length() >= 2) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        }

        return str;
    }


}
