/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 * <p>
 * lastTwo("coding") → "codign"
 * lastTwo("cat") → "cta"
 * lastTwo("ab") → "ba"
 */
public class lastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }

    public static String lastTwo(String str) {
        String newS = "";
        if (str.length() > 1) {
            String a = str.substring(str.length() - 2, str.length() - 1);
            String b = str.substring(str.length() - 1);
            newS = str.substring(0, str.length() - 3) + b + a;
            return newS;
        }
        return str;
    }


}
