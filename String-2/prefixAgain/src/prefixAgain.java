/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Does that prefix string appear somewhere else in the string?
 * Assume that the string is not empty and that N is in the range 1..str.length().
 * prefixAgain("abXYabc", 1) → true
 * prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 */
public class prefixAgain {
    public boolean prefixAgain(String str, int n) {

       for(int i = 0; i < str.length()  ; i++){
            if (str.substring(n,str.length()).contains(str.substring(0,n))){
                return true;
            }
       }
        return false;
    }

}
