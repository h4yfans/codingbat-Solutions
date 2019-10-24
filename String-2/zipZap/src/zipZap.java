/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
 * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 * zipZap("zipXzap") → "zpXzp"
 * zipZap("zopzop") → "zpzp"
 * zipZap("zzzopzop") → "zzzpzp"
 */
public class zipZap {

    public static void main(String[] args) {


    }

    public String zipZap(String str) {

        String newS = "";

        if (str.length() <= 2) return str;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
                newS += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
                i += 2;
            } else {
                newS += str.substring(i, i + 1);
            }
        }
        return newS;
    }

}
