/**
 * Created by KAAN on 23/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by a period (.). So "xxyz" counts but "x.xyz" does not.
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */
public class xyzThere {
    public boolean xyzThere(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) return true;

        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) return true;
        }
        return false;
    }


}
