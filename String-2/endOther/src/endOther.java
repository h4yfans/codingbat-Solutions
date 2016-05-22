/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given two strings, return true if either of the strings appears at the very end of the other string,
 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */
public class endOther {
    public boolean endOther(String a, String b) {

        String x = a.toLowerCase();
        String y = b.toLowerCase();

        if(x.length()>=y.length()){
            return x.substring(x.length()-y.length()).equals(y);
        }else
            return y.substring(y.length()-x.length()).equals(x);

    }
}
