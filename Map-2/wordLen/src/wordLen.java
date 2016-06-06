import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string
 * in the array, and the value is that string's length.
 * wordLen(["a", "bb", "a", "bb"]) → {"a": 1, "bb": 2}
 * wordLen(["this", "and", "that", "and"]) → {"that": 4, "this": 4, "and": 3}
 * wordLen(["code", "code", "code", "bug"]) → {"bug": 3, "code": 4}
 */
public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings){
            map.put(s,s.length());
        }

        return map;

    }

}
