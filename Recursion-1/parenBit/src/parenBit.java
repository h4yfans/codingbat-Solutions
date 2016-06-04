/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string that contains a single pair of parenthesis, compute recursively a new string made
 * of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
 * parenBit("xyz(abc)123") → "(abc)"
 * parenBit("x(hello)") → "(hello)"
 * parenBit("(xy)1") → "(xy)"
 */
public class parenBit {
    public String parenBit(String str) {


        if (str.substring(0, 1).equals("(") && str.substring(str.length() - 1).equals(")"))
            return str;

        if (str.substring(0, 1).equals("("))
            return parenBit(str.substring(0, str.length() - 1));

        return parenBit(str.substring(1));


    }
}
