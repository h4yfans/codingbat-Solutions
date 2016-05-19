/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * <p>
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 * <p>
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */
public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xabxxxcdx"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xxHxix"));

    }


    public static String stringX(String str) {
        if (str.length() > 1) {
            String newS = str.substring(1, str.length() - 1);
            String start = str.substring(0, 1);
            String end = str.substring(str.length() - 1, str.length());
            String s = "";
            for (int i = 0; i < newS.length(); i++) {
                if (!newS.substring(i).equals(newS.substring(newS.length(), newS.length()))) {
                    if (!newS.substring(i, i + 1).equals("x")) {
                        s = s + newS.substring(i, i + 1);
                    }
                }
            }
            return start + s + end;
        }
        return str;
    }
}
