/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
 * gHappy("xxggxx") → true
 * gHappy("xxgxx") → false
 * gHappy("xxggyygxx") → false
 */
public class gHappy {
    public static void main(String[] args) {
        System.out.println("ka");
        gHappy("yyygggxyy");

    }

    public static boolean gHappy(String str) {
        if (str.equals("")) return true;
        if (str.length() < 2) return false;
        if (str.equals("gg")) return true;
        if (str.substring(str.length() - 1).equals("g") && !str.substring(str.length() - 2, str.length() - 1).equals("g"))
            return false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("g") && str.substring(i + 1, i + 2).equals("g")) {
                i += 2;
            } else if (str.substring(i, i + 1).equals("g") && !str.substring(i + 1, i + 2).equals("g")) {
                return false;
            }
        }
        return true;

    }

}
