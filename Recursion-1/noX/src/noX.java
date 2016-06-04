/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
 */
public class noX {
    public String noX(String str) {

        if (str.length()==0) return str;

        if (str.charAt(0) == 'x')
            return "" + noX(str.substring(1));


        return str.charAt(0) + noX(str.substring(1));

    }

}
