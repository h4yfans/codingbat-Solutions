/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Return the number of times that the string "hi" appears anywhere in the given string.
 * <p>
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */
public class countHi {
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
