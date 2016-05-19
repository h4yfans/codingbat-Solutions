/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
 * Note that str.length() returns the length of a string.
 * <p>
 * firstTwo("Hello") → "He"
 * firstTwo("abcdefg") → "ab"
 * firstTwo("ab") → "ab"
 */
public class firstTwo {
    public static void main(String[] args) {


    }

    public String firstTwo(String str) {
        if (str.length()>2){
            return str.substring(0,2);
        }
        return str;
    }

}