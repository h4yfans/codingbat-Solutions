/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
 * stringClean("yyzzza") → "yza"
 * stringClean("abbbcdd") → "abcd"
 * stringClean("Hello") → "Helo"
 */
public class stringClean {
    public String stringClean(String str) {


        if (str.length()==1) return str;

        if (str.charAt(0) != str.charAt(1))
            return str.charAt(0) + stringClean(str.substring(1));


        return stringClean(str.substring(1));


    }

}
