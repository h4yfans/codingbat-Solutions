import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaan Karaca on 02/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
 */
public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {


        List<String> newArr = new ArrayList<String>();

        for(int i = 0; i < words.length ; i++){
            if (words[i].length()!=len)
                newArr.add(words[i]);
        }

        return newArr;

    }


}
