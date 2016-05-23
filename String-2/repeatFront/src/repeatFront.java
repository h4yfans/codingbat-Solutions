/**
 * Created by KAAN on 23/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string and an int n, return a string made of the first n characters of the string,
 * followed by the first n-1 characters of the string, and so on.
 * You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 * repeatFront("Chocolate", 4) → "ChocChoChC"
 * repeatFront("Chocolate", 3) → "ChoChC"
 * repeatFront("Ice Cream", 2) → "IcI"
 */
public class repeatFront {
    public String repeatFront(String str, int n) {
        int temp = n;
        String newS = "";
        for (int i = 0; i < n; i++) {
            if (n >= 0 && n <= str.length()) {
                newS += str.substring(0, temp);
                temp--;
            }
        }
        return newS;
    }


    public String repeatFrontSECONDWAY(String str, int n) {
        StringBuffer result = new StringBuffer(); 

        for (int i = n; i > 0; i--)
            result.append(str.substring(0, i));

        return result.toString();
    }
}
