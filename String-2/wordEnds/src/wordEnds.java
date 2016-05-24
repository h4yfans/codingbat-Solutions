/**
 * Created by KAAN on 24/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
 * Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
 * wordEnds("abcXY123XYijk", "XY") → "c13i"
 * wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 */
public class wordEnds {
    public String wordEnds(String str, String word) {
        if (word.length() >= str.length()) return "";
        String result = "";
        for (int i = -1; i < str.length() - word.length(); i++) {
            if (str.substring(i + 1, i + word.length() + 1).equals(word)) {
                if (i != -1) result += str.substring(i, i + 1);
                if (i + word.length() < str.length() - 1)
                    result += str.substring(i + 1 + word.length(), i + 2 + word.length());
            }
        }
        return result;
    }

}
