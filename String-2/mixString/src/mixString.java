/**
 * Created by KAAN on 23/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given two strings, a and b, create a bigger string made of the first char of a,
 * the first char of b, the second char of a, the second char of b, and so on.
 * Any leftover chars go at the end of the result.
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */
public class mixString {
    public String mixString(String a, String b) {

        String newS = "";
        int lenght = a.length() + b.length();

        for(int i = 0; i <lenght ; i++){
            if (i<a.length())
                newS += a.substring(i,i+1);
            if (i<b.length())
                newS += b.substring(i,i+1);
        }

        return newS;


    }

}
