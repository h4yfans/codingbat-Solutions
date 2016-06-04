/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
 * endX("xxre") → "rexx"
 * endX("xxhixx") → "hixxxx"
 * endX("xhixhix") → "hihixxx"
 */
public class endX {
    public String endX(String str) {

        if (str.length()==0) return str;

        if (str.charAt(0)!='x')
            return str.charAt(0) + endX(str.substring(1));


        return endX(str.substring(1)) + "x";

    }

}
