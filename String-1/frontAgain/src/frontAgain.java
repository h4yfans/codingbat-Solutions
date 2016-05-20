/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
 * <p>
 * frontAgain("edited") → true
 * frontAgain("edit") → false
 * frontAgain("ed") → true
 */
public class frontAgain {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {

        if (str.length() > 1) {
            return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
        }
        return false;
    }

}
