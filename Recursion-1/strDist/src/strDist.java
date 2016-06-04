/**
 * Created by Kaan Karaca on 05/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
 * strDist("catcowcat", "cat") → 9
 * strDist("catcowcat", "cow") → 3
 * strDist("cccatcowcatxx", "cat") → 9
 */
public class strDist {
    public int strDist(String str, String sub) {

        if (str.length()<sub.length()) return 0;

        if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub))
            return str.length();

        if (str.substring(0,sub.length()).equals(sub))
            return strDist(str.substring(0,str.length()-1),sub);

        return strDist(str.substring(1),sub);
    }

}
