/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
 * In other words, zero or more characters at the very begining of the given string,
 * and at the very end of the string in reverse order (possibly overlapping).
 * For example, the string "abXYZba" has the mirror end "ab".
 * mirrorEnds("abXYZba") → "ab"
 * mirrorEnds("abca") → "a"
 * mirrorEnds("aba") → "aba"
 */
public class mirrorEnds {
    public String mirrorEnds(String string) {

        StringBuffer buffer = new StringBuffer(string);
        StringBuffer reverse = buffer.reverse();
        String newS = "";

        for (int i = 1; i < string.length()+1; i++) {
            if (string.substring(0, i).equals(reverse.substring(0, i ))) {
                newS = string.substring(0, i);
            }
        }
        return newS;
    }

}
