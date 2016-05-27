/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 * sameEnds("abXYab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */
public class sameEnds {
    public String sameEnds(String string) {

        String newS = "";

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))) {
                newS = string.substring(0, i);
            }
        }
        return newS;
    }
}


