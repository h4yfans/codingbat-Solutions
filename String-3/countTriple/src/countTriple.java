/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
 * countTriple("abcXXXabc") → 1
 * countTriple("xxxabyyyycd") → 3
 * countTriple("a") → 0
 */
public class countTriple {
    public int countTriple(String str) {

        int count = 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2))
                count++;
        }
        return count;
    }

}
