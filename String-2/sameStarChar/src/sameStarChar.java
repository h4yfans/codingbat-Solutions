/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
 * sameStarChar("xy*yzz") → true
 * sameStarChar("xy*zzz") → false
 * sameStarChar("*xa*az") → true
 */
public class sameStarChar {
    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return false;
    }

    public boolean sameStarCharSECONWAY(String str) {
        for (int i=1; i<str.length()-1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i-1) != str.charAt(i+1)) return false;
            }
        }
        return true;
        
        // Solution notes: loop through the chars 1..len-2 (that is,
        // skip over the first and last chars). Each time that the char
        // is '*', check that the chars before and after it are equal. If they
        // are not, return false immediately.
    }
}
