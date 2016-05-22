/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, return a string where for every char in the original, there are two chars.
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class doubleChar {
    public String doubleChar(String str) {
        String newS = "";
        for (int i = 0; i < str.length(); i++)
            newS += str.substring(i, i + 1) + str.substring(i, i + 1);

        return newS;

    }

}
