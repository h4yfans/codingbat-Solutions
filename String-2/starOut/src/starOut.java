/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */
public class starOut {

    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.substring(i - 1, i).equals("*")) continue;
            if (str.substring(i, i + 1).equals("*")) continue;
            if (i != str.length() - 1 && str.substring(i + 1, i + 2).equals("*")) continue;
            result += str.substring(i, i + 1);
        }
        return result;
    }
}
