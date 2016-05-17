/**
 * Created by KAAN on 17/05/2016.
 * <p>
 * <p>
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * <p>
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }

    public static boolean startHi(String str) {

        if (str.startsWith("hi"))
            return true;

        return false;

    }

}
