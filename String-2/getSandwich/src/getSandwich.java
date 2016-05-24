/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * A sandwich is two pieces of bread with something in between.
 * Return the string that is between the first and last appearance of "bread" in the given string,
 * or return the empty string "" if there are not two pieces of bread.
 * getSandwich("breadjambread") → "jam"
 * getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */
public class getSandwich {
    public String getSandwich(String str) {

        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        if (str.length() > 10) {
            if (firstIndex==lastIndex) return "";
            return str.substring(firstIndex+5,lastIndex);
        }

        return "";
    }


}
