/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * <p>
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
 * <p>
 * left2("Hello") → "lloHe"
 * left2("java") → "vaja"
 * left2("Hi") → "Hi"
 */
public class left2 {
    public static void main(String[] args) {

        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

    public static String left2(String str) {

        String end = str.substring(0, 2);
        String first = str.substring(2, str.length());
        return first + end;


    }


}
