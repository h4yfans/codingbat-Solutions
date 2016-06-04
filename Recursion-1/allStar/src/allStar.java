/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 * allStar("hello") → "h*e*l*l*o"
 * allStar("abc") → "a*b*c"
 * allStar("ab") → "a*b"
 */
public class allStar {
    public String allStar(String str) {

        if (str.length()==0) return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));

    }

}
