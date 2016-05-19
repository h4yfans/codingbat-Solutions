/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return true if it ends in "ly".
 * <p>
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */
public class endsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 2, str.length()).equals("ly");
        }
        return false;


    }

}
