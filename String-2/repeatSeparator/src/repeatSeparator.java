/**
 * Created by KAAN on 23/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 * repeatSeparator("This", "And", 2) → "ThisAndThis"
 * repeatSeparator("This", "And", 1) → "This"
 */
public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {

        String newS = "";


        for (int i = 0; i < count ; i++) {
            if (i+1==count){
                newS+=word;
                return newS;
            }
            newS += word + sep;
        }
        return newS;

    }
}
